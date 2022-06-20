package com.bilhetenacinaldetrasportsbnit.Model;

import java.util.Date;

public class IslandTravel extends Travel{

    private String departureLocation;
    private  Date departureDate;
    private Date arrivalDate;
    private String arrivalLocation;

    public IslandTravel(String state) {

        super(state);
    }


    public Boolean cancelTravel(){

        return  true;
    }
}
