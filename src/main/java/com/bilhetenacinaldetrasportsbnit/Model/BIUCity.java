package com.bilhetenacinaldetrasportsbnit.Model;

import java.util.ArrayList;


public class BIUCity extends BIU implements TransportTitle{
    private int totalTrips;
    private ArrayList<LocalTravel> travelList;

    public BIUCity(String firstName, String lastName, String address, String email, int phone) {
        super(firstName, lastName, address, email, phone);
    }

    public BIUCity(Holder holder){
        super(holder);
    }

    @Override
    public boolean payTravel(double price) {
        return false;
    }

    @Override
    public boolean chargeTravel(int amountOfTravels) {
        return false;
    }
}
