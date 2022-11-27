package com.challamani.blockchain.service;

import com.challamani.blockchain.domain.Wallet;
import com.challamani.blockchain.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WalletService {

    private final WalletRepository walletRepository;

    public List<Wallet> getAll() {
        return walletRepository.findAll();
    }

    public Wallet save(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    public List<Wallet> saveAll(List<Wallet> wallets){
        return walletRepository.saveAll(wallets);
    }
}
