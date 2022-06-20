package com.bilhetenacinaldetrasportsbnit.Model;

import java.util.ArrayList;

public class Batch {
    public static int code = 1;
    private int codeBatch;
    private int totalPlaces;
    private int availablePlaces;
    private double price;
    private ArrayList<Travel> travels;

    public Batch(int totalPlaces){
        this.totalPlaces = totalPlaces;
        this.availablePlaces = totalPlaces;

        this.codeBatch = Batch.code;
        Batch.code += 1;
    }
    public Batch(int totalPlaces, int availablePlaces ){
        this.totalPlaces = totalPlaces;
        this.availablePlaces = availablePlaces;

        this.codeBatch = Batch.code;
        Batch.code += 1;
    }


    public int getCodeBatch() {
        return codeBatch;
    }
}
