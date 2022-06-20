package com.bilhetenacinaldetrasportsbnit.Model;

import java.util.ArrayList;

public interface Partner {

    ArrayList<Transactions> IT = null;
    Statute classIF = Statute.NORMAL;
    int points = 0;

    public Transactions getTransactions();

    public int calculatePoints();

    public void promotion(Statute newStatute);

    public void demote(Statute newStatute);

}
