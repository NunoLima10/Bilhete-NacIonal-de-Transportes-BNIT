package com.bilhetenacinaldetrasportsbnit.Model;

import java.time.LocalDate;
import java.util.Date;


public class TSale extends Transactions {
    private int deadline;
    private LocalDate payDay;

    public TSale(Date date, int transactionNumber) {
        super(date, transactionNumber);
    }
}
