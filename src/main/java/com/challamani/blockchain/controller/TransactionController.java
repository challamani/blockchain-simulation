package com.challamani.blockchain.controller;

import com.challamani.blockchain.domain.Transaction;
import com.challamani.blockchain.service.TransactionService;
import com.challamani.blockchain.domain.Criteria;
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

    @PostMapping(value = {"/transactions"}, produces = {"application/json"})
    public ResponseEntity<List<Transaction>> createTransaction(@RequestBody List<Transaction> transactions) {
        List<Transaction> results = transactionService.store(transactions);
        return new ResponseEntity<>(results, HttpStatus.ACCEPTED);
    }

    @GetMapping(value = {"/transactions/{blockId}"}, produces = {"application/json"})
    public List<Transaction> getByBlockId(@PathVariable(value = "blockId") String blockId)  {
        return null;
    }

}
