package com.bilhetenacinaldetrasportsbnit.Model;


import java.time.LocalDate;
import java.util.Date;

public class TPurchase extends Transactions {
    private LocalDate payDay;
    private LocalDate dateValue;


    public TPurchase(Date date, int transactionNumber) {
        super(date, transactionNumber);
    }
}
