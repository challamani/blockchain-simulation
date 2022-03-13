package com.practice.java.blockchain.repository;

import com.practice.java.blockchain.domain.Criteria;
import com.practice.java.blockchain.domain.Transaction;
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
    public TransactionRepository(){
        transactions = new ArrayList<>();
    }

    public void save(List<Transaction> transactions){
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
                        (StringUtils.isEmpty(filterCriteria.getTransaction().getFrom())
                                || StringUtils.equals(filterCriteria.getTransaction().getFrom(), transaction.getFrom()))
                        &&
                        (StringUtils.isEmpty(filterCriteria.getTransaction().getTo())
                                || StringUtils.equals(filterCriteria.getTransaction().getTo(), transaction.getTo()))
                        &&
                        (StringUtils.isEmpty(filterCriteria.getTransaction().getStatus())
                                || StringUtils.equals(filterCriteria.getTransaction().getStatus(), transaction.getStatus()))

        );
    }

}
