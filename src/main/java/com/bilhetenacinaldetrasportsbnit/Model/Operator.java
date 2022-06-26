package com.bilhetenacinaldetrasportsbnit.Model;

import com.bilhetenacinaldetrasportsbnit.Model.enumerations.OperatorCategory;
import com.bilhetenacinaldetrasportsbnit.Model.enumerations.Statute;
import com.bilhetenacinaldetrasportsbnit.Model.interfaces.Partner;

import java.util.ArrayList;

public class Operator implements Partner {
    private String code;
    private String firstName;
    private String lastName;
    private String address;
    private OperatorCategory category;
    private ArrayList<TPurchase> Purchases;
    private  ArrayList<IslandTravel> travelList;

    public Operator(String firstName, String lastName, String address, OperatorCategory category) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.category = category;
        this.code = generateCode();
        Purchases = new ArrayList<>();
        travelList = new ArrayList<>();

    }
    public String generateCode(){
        return "Code Generated";
        //implementar
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
    public TPurchase getTransactions() {
        //return this.Purchases;
        return  null;
    }

    @Override
    public int calculatePoints() {
        return 0;
    }

    @Override
    public void promotion(Statute newStatute) {
        //this.classIF = newStatute;
    }

    @Override
    public void demote(Statute newStatute) {
        //this.classIF = newStatute;
    }
    public void addNewTravel(IslandTravel travel){
        this.travelList.add(travel);

    }
    public IslandTravel getTravelByCode(String code){
        String travelCode;
        for (IslandTravel islandTravel : travelList) {
            if ((islandTravel.getCode().equals(code))) return islandTravel;
        }
        return null;
    }

    public  void  deleteTravel(IslandTravel travel) {
        for (int i = 0; i < travelList.size(); i++) {
            if (travelList.get(i).equals(travel)) {
                travelList.remove(i);
                break;
            }
        }


    }
}
