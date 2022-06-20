package com.bilhetenacinaldetrasportsbnit.Model;

import java.util.ArrayList;

public class Operator implements Partner {
    private String code;
    private String name;
    private String address;
    private OperatorCategory category;
    private ArrayList<TPurchase> Purchases;
    private  ArrayList<Travel> travelList;

    public Operator(String name, String address, OperatorCategory category) {
        this.name = name;
        this.address = address;
        this.category = category;
        this.code = generateCode();
    }
    public String generateCode(){
        return "Code Generated";
        //implementar
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public OperatorCategory getCategory() {
        return category;
    }

    public void setCategory(OperatorCategory category) {
        this.category = category;
    }

    public ArrayList<TPurchase> getSales() {
        return Purchases;
    }

    public void setSales(ArrayList<TPurchase> Purchases) {
        this.Purchases = Purchases;
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
