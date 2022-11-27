package com.challamani.blockchain.repository;

import com.challamani.blockchain.domain.Wallet;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface WalletRepository extends MongoRepository<Wallet, String> {


}
