package com.practice.java.blockchain.service;

import com.practice.java.blockchain.domain.Criteria;
import com.practice.java.blockchain.domain.Transaction;
import com.practice.java.blockchain.repository.TransactionRepository;
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
