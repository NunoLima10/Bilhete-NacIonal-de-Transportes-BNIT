package com.bilhetenacinaldetrasportsbnit.Controller;

import com.bilhetenacinaldetrasportsbnit.MainApplication;
import com.bilhetenacinaldetrasportsbnit.Model.BIUIslands;
import com.bilhetenacinaldetrasportsbnit.Model.Operator;
import com.bilhetenacinaldetrasportsbnit.Model.enumerations.OperatorCategory;
import com.bilhetenacinaldetrasportsbnit.Model.interfaces.ChangeScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInOperatorController implements Initializable, ChangeScene {

    Operator operator;
    @FXML
    public ChoiceBox<String> CategoryInput;
    public TextField lastNameInput;
    public TextField addressInput;
    public TextField firstNameInput;
    public Button loginButton;


    @FXML
    void login(ActionEvent event) throws IOException {

        if (validOperationInfo()) {

            operator = registerOperator();

           String filePath = "views/operatorInterface.fxml";
            try {
                FXMLLoader fxmlLoader = changeScene(event, filePath);
                OperationInterfaceController operationInterfaceController = fxmlLoader.getController();

                operationInterfaceController.setOperator(operator);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void addNewOperator(){

    }

    public  boolean validOperationInfo(){
        if(!(firstNameInput.getText().length() >0)) return false;
        if(!(lastNameInput.getText().length() >0)) return false;
        if(!(addressInput.getText().length() >0)) return false;

        return (CategoryInput.getValue()!= null);
    }

    public Operator registerOperator(){
        String firstName = firstNameInput.getText();
        String lastName = lastNameInput.getText();
        String address = addressInput.getText();
        OperatorCategory category = OperatorCategory.AIR.getCategoryByNAme(CategoryInput.getValue());

        return new Operator(firstName,lastName,address,category);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            String[]  Category = {"Aéreo","Terreste","Marítimo"};
            CategoryInput.getItems().addAll(Category);
    }

    @Override
    public FXMLLoader changeScene(ActionEvent event, String filePath) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(filePath));

        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);

        stage.show();
        return  fxmlLoader;

    }


}

