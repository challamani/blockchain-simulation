package com.practice.java.blockchain.controller;

import com.practice.java.blockchain.domain.Criteria;
import com.practice.java.blockchain.domain.Transaction;
import com.practice.java.blockchain.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @RequestMapping(value = {"/transactions/add"},method = RequestMethod.POST, produces = {"application/json"})
    public ResponseEntity<List<Transaction>> store(@RequestBody List<Transaction> transactions) {
        List<Transaction> results = transactionService.store(transactions);
        return new ResponseEntity<>(results, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = {"/transactions"},method = RequestMethod.POST, produces = {"application/json"})
    public List<Transaction> get(@RequestBody Criteria filterCriteria)  {
        return transactionService.get(filterCriteria);
    }


}
