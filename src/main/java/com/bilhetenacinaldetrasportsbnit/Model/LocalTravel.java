package com.bilhetenacinaldetrasportsbnit.Model;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LocalTravel extends Travel{
    private Set<Stop> route;

    private double price;
    public LocalTravel(String state,Operator operator,Set<Stop> route) {
        this.state = state;
        this.operator = operator;
        this.route = route;


    }
    private void generateRoute(){
        //como não é passado no parametro apenas crei umas instacias
        this.route = new HashSet<Stop>();
        this.route.add(new Stop("Regala","ida", LocalDate.of(2022,6,22)));
        this.route.add(new Stop("Ponte de agua","ida", LocalDate.of(2022,6,22)));
        this.route.add(new Stop("Mercado de peixe","ida", LocalDate.of(2022,6,22)));

    }

    @Override
    public String generateCode() {
        return null;
    }
}

