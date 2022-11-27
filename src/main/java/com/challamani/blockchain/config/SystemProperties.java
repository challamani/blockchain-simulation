package com.challamani.blockchain.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConfigurationProperties(prefix = "block-chain", ignoreInvalidFields = true)
public class SystemProperties {

    private Integer difficulty;
    private Integer maxAllowedTransactions;
    private Integer interval;
    private Integer size;

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getMaxAllowedTransactions() {
        return maxAllowedTransactions;
    }

    public void setMaxAllowedTransactions(Integer maxAllowedTransactions) {
        this.maxAllowedTransactions = maxAllowedTransactions;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
