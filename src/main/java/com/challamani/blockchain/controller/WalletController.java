package com.challamani.blockchain.controller;

import com.challamani.blockchain.domain.Wallet;
import com.challamani.blockchain.service.WalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class WalletController {

    private final WalletService walletService;

    @GetMapping("/wallets")
    public ResponseEntity<List<Wallet>> getWallets() {
        return ResponseEntity.ok().body(walletService.getAll());
    }

    @PostMapping("/wallet")
    public ResponseEntity<Wallet> createWallet(@RequestBody Wallet wallet) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(walletService.save(wallet));
    }

    @PostMapping("/wallets")
    public ResponseEntity<List<Wallet>> createWallets(@RequestBody List<Wallet> wallets) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(walletService.saveAll(wallets));
    }
}
