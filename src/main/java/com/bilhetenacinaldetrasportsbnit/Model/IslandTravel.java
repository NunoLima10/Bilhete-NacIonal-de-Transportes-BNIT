package com.bilhetenacinaldetrasportsbnit.Model;

import java.time.LocalDate;
import java.util.Objects;


public class IslandTravel extends Travel{


    private String departureLocation;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private String arrivalLocation;



    public IslandTravel(String state, Operator operator, String departureLocation, LocalDate departureDate,
                        LocalDate arrivalDate, String arrivalLocation) {
        this.state = state;
        this.operator = operator;
        this.departureLocation = departureLocation;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.arrivalLocation = arrivalLocation;
        this.code = generateCode();
    }

    @Override
    public String toString() {
        return getState()+ ": " +departureLocation + " " + "(" +departureDate.toString()+")" + "->"
                + arrivalLocation + "(" + arrivalDate.toString() + ")";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IslandTravel travel = (IslandTravel) o;
        return Objects.equals(departureLocation, travel.departureLocation) && Objects.equals(departureDate, travel.departureDate) && Objects.equals(arrivalDate, travel.arrivalDate) && Objects.equals(arrivalLocation, travel.arrivalLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureLocation, departureDate, arrivalDate, arrivalLocation);
    }


    @Override
    public String generateCode() {
        return toString();
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
