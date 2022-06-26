package com.bilhetenacinaldetrasportsbnit.Model.interfaces;

import com.bilhetenacinaldetrasportsbnit.Model.Transactions;
import com.bilhetenacinaldetrasportsbnit.Model.enumerations.Statute;

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
