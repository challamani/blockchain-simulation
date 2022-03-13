package com.practice.java.blockchain.domain;

import lombok.Data;

@Data
public class Criteria{
    private Transaction transaction;
    private Wallet wallet;
    private Blockchain blockchain;
}
