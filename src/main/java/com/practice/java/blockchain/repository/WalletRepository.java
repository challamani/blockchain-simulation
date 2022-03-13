package com.practice.java.blockchain.repository;

import com.practice.java.blockchain.domain.Wallet;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
@Slf4j
public class WalletRepository {

    private Map<String, Wallet> walletMap;
    @Autowired
    public WalletRepository(){
        walletMap = new HashMap<>();
    }

    public void save(Wallet wallet) {
        if (StringUtils.isEmpty(wallet.getWalletId())) {
            wallet.setWalletId(UUID.randomUUID().toString());
        }
        walletMap.put(wallet.getWalletId(), wallet);
    }
}
