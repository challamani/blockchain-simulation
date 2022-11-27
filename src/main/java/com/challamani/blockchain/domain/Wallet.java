package com.challamani.blockchain.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Wallet {
    @Id
    private String id;
    private String walletId;
    private Double reservedUnits;
    private Double unites;
    private Double value;
    private String currency;
    private String contactNo;
    private String enabledIp;
    private String macAddress;
    private String email;

    public Wallet() {
    }

}
