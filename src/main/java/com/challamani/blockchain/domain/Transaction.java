package com.challamani.blockchain.domain;

import lombok.Data;


@Data
public class Transaction {
    private String transactionId;
    private String description;
    private String fromWalletId;
    private String toWalletId;
    private String date;
    private String hashValue;
    private String fee;
    private Double value;
    private boolean isValid;
    private String status;
    private Double units;
    private String currency;
}
