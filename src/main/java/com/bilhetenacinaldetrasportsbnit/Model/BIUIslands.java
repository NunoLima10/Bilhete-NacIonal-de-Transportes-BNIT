package com.bilhetenacinaldetrasportsbnit.Model;

import java.time.LocalDate;
import java.util.ArrayList;


public class BIUIslands extends BIU implements IslandTicket {
    private ArrayList<IslandTravel> IslandsTravel;
    private ArrayList<Route> routes;


    public BIUIslands(String firstName, String lastName, String address, String email, int phone) {
        super(firstName, lastName, address, email, phone);
    }
    public BIUIslands(Holder holder){
        super(holder);
    }

    @Override
    public ArrayList<IslandTravel> findTravel(LocalDate departureDate, String departureLocation, LocalDate arrivalDate, String arrivalLocation, Boolean promotion) {
        return null;
    }

    @Override
    public ArrayList<IslandTravel> buyTravel() {
        return null;
    }
}
