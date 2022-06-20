package com.bilhetenacinaldetrasportsbnit.Model;

public class Holder implements Partner {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int phone;


    public Holder(String firstName, String lastName, String address, String email, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public Transactions getTransactions() {
        return null;
    }

    @Override
    public int calculatePoints() {
        return 0;
    }

    @Override
    public void promotion(Statute newStatute) {

    }

    @Override
    public void demote(Statute newStatute) {

    }
}
