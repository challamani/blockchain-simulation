package com.challamani.blockchain.domain;

import java.util.List;

public class Block {

    private Integer blockId;
    private String sha256Value;
    private List<Transaction> transactions;
}
