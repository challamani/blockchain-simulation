package com.challamani.blockchain.util;

public class Constant {

    public enum TRAN_STATUS {
        IN_PROGRESS("IN_PROGRESS"),
        VERIFIED("VERIFIED"),
        COMPLETED("COMPLETED"),
        CANCELLED("CANCELLED"),
        IN_VALID("IN_VALID"),
        MEM_POOL("MEM_POOL");

        private String status;

        TRAN_STATUS(String status) {
            this.status = status;
        }

        private String getStatus() {
            return this.status;
        }
    }
}
