package com.challamani.blockchain.repository;

import com.challamani.blockchain.domain.Transaction;
import com.challamani.blockchain.domain.Criteria;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class TransactionRepository {

    private List<Transaction> transactions;

    @Autowired
    public TransactionRepository() {
        transactions = new ArrayList<>();
    }

    public void save(List<Transaction> transactions) {
        transactions.addAll(transactions);
    }

    public List<Transaction> fetchTransactionsOnCriteria(Criteria filterCriteria) {
        return transactions.stream().filter(transaction ->
                isContains(transaction, filterCriteria)).collect(Collectors.toList());
    }

    private boolean isContains(Transaction transaction, Criteria filterCriteria) {
        return (
                (StringUtils.isEmpty(filterCriteria.getTransaction().getTransactionId())
                        || StringUtils.equals(filterCriteria.getTransaction().getTransactionId(), transaction.getTransactionId()))
                        &&
                        (StringUtils.isEmpty(filterCriteria.getTransaction().getFromWalletId())
                                || StringUtils.equals(filterCriteria.getTransaction().getFromWalletId(), transaction.getFromWalletId()))
                        &&
                        (StringUtils.isEmpty(filterCriteria.getTransaction().getToWalletId())
                                || StringUtils.equals(filterCriteria.getTransaction().getToWalletId(), transaction.getToWalletId()))
                        &&
                        (StringUtils.isEmpty(filterCriteria.getTransaction().getStatus())
                                || StringUtils.equals(filterCriteria.getTransaction().getStatus(), transaction.getStatus()))

        );
    }
}
