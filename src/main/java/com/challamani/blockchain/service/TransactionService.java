package com.challamani.blockchain.service;

import com.challamani.blockchain.domain.Criteria;
import com.challamani.blockchain.domain.Transaction;
import com.challamani.blockchain.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> store(List<Transaction> transactions) {
        transactionRepository.save(transactions);
        return transactions;
    }

    public List<Transaction> get(Criteria filterCriteria) {
        return transactionRepository.fetchTransactionsOnCriteria(filterCriteria);
    }
}
