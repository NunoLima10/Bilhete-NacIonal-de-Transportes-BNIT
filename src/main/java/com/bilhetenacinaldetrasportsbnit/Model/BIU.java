package com.bilhetenacinaldetrasportsbnit.Model;

import java.time.LocalDate;



public abstract class BIU {
    public static int code = 1;
    public static int validTime = 1;

    private final int codeBIU;
    private final LocalDate date;
    private LocalDate expirationDate;
    private double balance;
    private final String validationKey;

    private Holder holder;



    public BIU(String firstName,String lastName, String address, String email, int phone){
        this.holder = new Holder(firstName,lastName, address, email, phone);
        this.date = LocalDate.now();
        this.expirationDate = this.date.plusYears(validTime);
        this.balance = 0;

        this.codeBIU =  BIU.code;
        BIU.code += 1;
        this.validationKey = this.generateKey();
    }

    public BIU( Holder holder){
        this.holder = holder;
        this.date = LocalDate.now();
        this.expirationDate = this.date.plusYears(validTime);
        this.balance = 0;

        this.codeBIU =  BIU.code;
        BIU.code += 1;
        this.validationKey = generateKey();
    }

    public int getCodeBIU() {
        return codeBIU;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String generateKey(){

        String holderFirstName = this.holder.getFirstName().toLowerCase();
        String holderLastName = this.holder.getLastName().toLowerCase();
        String date = this.date.toString();
        String code = String.valueOf(this.codeBIU);

        String reverseFirstName = new StringBuilder(holderFirstName).reverse().toString();
        String reverseLastName = new StringBuilder(holderLastName).reverse().toString();

        int firstNameSize = Math.min(reverseFirstName.length(), 5);
        int lastNameSize =  Math.min(reverseLastName.length(), 5);

        String firstName = reverseFirstName.toUpperCase().charAt(0) + reverseFirstName.substring(1,firstNameSize);
        String lastName = reverseLastName.toUpperCase().charAt(0) + reverseLastName.substring(1,lastNameSize);

        return firstName + lastName + date + code;

    }
    private  boolean isExpired(){
        LocalDate data = LocalDate.now();
        return data.isBefore(this.expirationDate);
    }


}
