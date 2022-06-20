package com.bilhetenacinaldetrasportsbnit.Model;

import java.util.Date;

public class Transactions {
    public static int number = 1;

    private Date date;
    private int TransactionNumber;

    public Transactions(Date date, int transactionNumber) {
        this.date = date;
        TransactionNumber = transactionNumber;
    }
}
