package com.challamani.blockchain.repository;

import com.challamani.blockchain.domain.Block;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

public interface BlockRepository extends MongoRepository<Block, String> {
}
