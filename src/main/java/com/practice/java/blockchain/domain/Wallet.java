package com.practice.java.blockchain.domain;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Wallet {
    private String walletId;
    private Double reservedUnits;
    private Double unites;
    private Double value;
    private String currency;
    private String contactNo;
    private String enabledIp;
    private String macAddress;
    private String email;
    private Map<String, List<Transaction>> blockTransactions;
}
