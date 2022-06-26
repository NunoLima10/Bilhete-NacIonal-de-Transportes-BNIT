package com.bilhetenacinaldetrasportsbnit.Controller;

import com.bilhetenacinaldetrasportsbnit.Model.BIUIslands;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UserInterfaceController {

    @FXML
    public Label balanceLabel;
    public TextField findTravelInput;
    public Label nameOperator;
    public CheckBox notificationCheckbox;
    BIUIslands pass;

    @FXML
    void puchaseButton(ActionEvent event) {

    }

    public void setBUI(BIUIslands pass) {
        this.pass = pass;

    }
}
