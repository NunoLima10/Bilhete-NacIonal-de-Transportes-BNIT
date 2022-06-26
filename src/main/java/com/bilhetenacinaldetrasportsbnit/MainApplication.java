package com.bilhetenacinaldetrasportsbnit;

import com.bilhetenacinaldetrasportsbnit.Model.*;
import com.bilhetenacinaldetrasportsbnit.Model.enumerations.OperatorCategory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("views/Login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Bilhete Nacional Intermodal de Transporte");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        /*ArrayList<LocalTravel> travelList = new ArrayList<>();
        travelList.add(new LocalTravel("c"));

        Holder nuno = new Holder("nuno","Lima","plato","email",999);
        BIUCity pass = new BIUCity(nuno, travelList);

        pass.chargeBalance(50);
        pass.chargeTravel(50);
        System.out.println(pass.isExpired());
        double saldo = pass.getBalance();
        System.out.println(saldo);

        ============================================================
        Operator operator = new Operator("alguem","perdido","narnia", OperatorCategory.AIR);
        IslandTravel islandTravel = new IslandTravel("comprado",operator,"são vicente",LocalDate.now(),
                LocalDate.now().plusDays(2),"santo antão");


        ArrayList <IslandTravel> IslandsTravels = new ArrayList<>();
        IslandsTravels.add(islandTravel);
        Holder nuno = new Holder("nuno","Lima","plato","email",999);
        BIUIslands passIlha = new BIUIslands(nuno, IslandsTravels);
        System.out.println(passIlha.buyTravel());*/


    }

    public static void main(String[] args) {
        launch();
    }

    }