package com.bilhetenacinaldetrasportsbnit.Model;

public interface TransportTitle {
    double travelPrice = 0;

    public boolean payTravel(double price);
    public boolean chargeTravel(int amountOfTravels);

}
