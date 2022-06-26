package com.bilhetenacinaldetrasportsbnit.Model.interfaces;

public interface TransportTitle {
    double travelPrice = 40;

    public double payTravel(double price);
    public boolean chargeTravel(int amountOfTravels);

}
