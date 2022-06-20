package com.bilhetenacinaldetrasportsbnit.Model;


import java.util.Set;

public class LocalTravel extends Travel{
    private Set<Stop> route;
    private double price;
    public LocalTravel(String state) {
        super(state);
        //construtor deve receber preço ?
    }
}
