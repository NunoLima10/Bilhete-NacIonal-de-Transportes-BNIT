package com.bilhetenacinaldetrasportsbnit.Model;

import com.bilhetenacinaldetrasportsbnit.Model.interfaces.IslandTicket;

import java.time.LocalDate;
import java.util.ArrayList;


public class BIUIslands extends BIU implements IslandTicket {
    private ArrayList<IslandTravel> IslandsTravel;
    private ArrayList<Route> routes;


    public BIUIslands(String firstName, String lastName, String address, String email, int phone,
                      ArrayList<IslandTravel> IslandsTravel) {
        super(firstName, lastName, address, email, phone);
        this.IslandsTravel = IslandsTravel;
    }
    public BIUIslands(Holder holder,ArrayList<IslandTravel> IslandsTravel){
        super(holder);
        this.IslandsTravel = IslandsTravel;
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
