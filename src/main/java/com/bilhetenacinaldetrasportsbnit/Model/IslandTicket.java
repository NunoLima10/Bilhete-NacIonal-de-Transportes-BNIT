package com.bilhetenacinaldetrasportsbnit.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IslandTicket {

    public ArrayList<IslandTravel> findTravel (LocalDate departureDate, String departureLocation, LocalDate arrivalDate,
                                               String arrivalLocation, Boolean promotion);

    public ArrayList<IslandTravel> buyTravel();

}
