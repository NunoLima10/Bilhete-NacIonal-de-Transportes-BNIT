package com.bilhetenacinaldetrasportsbnit.Controller;

import com.bilhetenacinaldetrasportsbnit.Model.IslandTravel;
import com.bilhetenacinaldetrasportsbnit.Model.LocalTravel;
import com.bilhetenacinaldetrasportsbnit.Model.Operator;
import com.bilhetenacinaldetrasportsbnit.Model.Travel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class OperationInterfaceController implements Initializable {

    @FXML
    public Button CreateTravelButton;
    public DatePicker arrivalDateBox;
    public DatePicker departureDateBox;
    public TextField arrivalLocationBox;
    public TextField departureLocationBox;
    public ListView<String> TravelListView;
    public Label nameOperator;
    public Label labelErro;
    public TextField StateBox;
    public IslandTravel selectedTravel;

    private Operator operator;

    public void setOperator(Operator operator){
        this.operator = operator;
        nameOperator.setText(operator.getFirstName() +" "+ operator.getLastName());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        departureDateBox.setValue(LocalDate.now());
        System.out.println(TravelListView.getSelectionModel().getSelectedItems());

        TravelListView.getSelectionModel().selectedItemProperty().addListener((arg0, arg1, arg2) -> {

            clearInputs();

            String TravelLabel = TravelListView.getSelectionModel().getSelectedItem();

            selectedTravel = operator.getTravelByCode(TravelLabel);

            if (selectedTravel != null) {

                arrivalDateBox.setValue(selectedTravel.getArrivalDate());
                departureDateBox.setValue(selectedTravel.getDepartureDate());

                StateBox.setText(selectedTravel.getState());
                departureLocationBox.setText(selectedTravel.getDepartureLocation());
                arrivalLocationBox.setText(selectedTravel.getArrivalLocation());

            }
        });

    }
    public void registerTravel(){

        if(validTravelInfo()){
            labelErro.setText("");
            String state = StateBox.getText();
            String departureLocation = departureLocationBox.getText();
            String arrivalLocation =  arrivalLocationBox.getText();
            LocalDate arrivalDate = arrivalDateBox.getValue();
            LocalDate departureDate = departureDateBox.getValue();

            IslandTravel travel = new IslandTravel(state,operator,departureLocation,departureDate,
                    arrivalDate,arrivalLocation);

            if (!travel.equals(selectedTravel)) {
                operator.addNewTravel((travel));
                clearInputs();
                TravelListView.getItems().add(travel.toString());
            }else {
                labelErro.setText("A Viagem ja exite,deve editala");
            }
        }
        else {
            labelErro.setText("Informações Invalidas");

        }
    }

    public void delete(){
        try {
            operator.deleteTravel(selectedTravel);
            TravelListView.getItems().remove(selectedTravel.getCode());
            selectedTravel = null;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void edit() {
        if (validTravelInfo()) {
            labelErro.setText("");
            try {
                TravelListView.getItems().remove(selectedTravel.getCode());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            String state = StateBox.getText();
            String departureLocation = departureLocationBox.getText();
            String arrivalLocation = arrivalLocationBox.getText();
            LocalDate arrivalDate = arrivalDateBox.getValue();
            LocalDate departureDate = departureDateBox.getValue();

            IslandTravel travel = new IslandTravel(state, operator, departureLocation, departureDate,
                    arrivalDate, arrivalLocation);
            operator.addNewTravel((travel));
            clearInputs();
            TravelListView.getItems().add(travel.toString());


        }
        else {
            labelErro.setText("Informações Invalidas");

        }
    }


    public void clearInputs(){
        arrivalDateBox.setValue(null);
        departureDateBox.setValue(LocalDate.now());

        StateBox.setText("");
        departureLocationBox.setText("");
        arrivalLocationBox.setText("");
    }
    private boolean validTravelInfo(){
        LocalDate today = LocalDate.now();
        if(arrivalDateBox.getValue() !=null) {
            if (today.isAfter(arrivalDateBox.getValue())) return false;
        }
        if(departureDateBox.getValue() !=null) {
            if (today.isAfter(departureDateBox.getValue())) return false;
        }
        if(!(arrivalLocationBox.getText().length() >0)) return false;
        if (!(departureLocationBox.getText().length() > 0))return false;
        return departureDateBox.getValue().isBefore(arrivalDateBox.getValue());
    }
}