package com.bilhetenacinaldetrasportsbnit.Model;

import com.bilhetenacinaldetrasportsbnit.Model.interfaces.TransportTitle;

import java.util.ArrayList;


public class BIUCity extends BIU implements TransportTitle {
    private int totalTrips;
    private ArrayList<LocalTravel> travelList;

    public BIUCity(String firstName, String lastName, String address, String email, int phone,
                   ArrayList<LocalTravel>travelList) {
        super(firstName, lastName, address, email, phone);
        this.travelList = travelList;
    }

    public BIUCity(Holder holder,ArrayList<LocalTravel>travelList){
        super(holder);
        this.travelList = travelList;
    }

    @Override
    public double payTravel(double price) {
        if (isExpired()) return price;
        if (travelPrice > price) return price;
        this.balance -= travelPrice;
        return price-travelPrice;
    }

    @Override
    public boolean chargeTravel(int amountOfTravels) {
        if (isExpired()) return false;
        //LocalTravel travel = new LocalTravel("c");
        //this.travelList.add(travel);
        return true;
    }
}
