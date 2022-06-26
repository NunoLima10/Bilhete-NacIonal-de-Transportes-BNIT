package com.bilhetenacinaldetrasportsbnit.Controller;

import com.bilhetenacinaldetrasportsbnit.MainApplication;
import com.bilhetenacinaldetrasportsbnit.Model.*;
import com.bilhetenacinaldetrasportsbnit.Model.enumerations.OperatorCategory;
import com.bilhetenacinaldetrasportsbnit.Model.interfaces.ChangeScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class LoginScreenController implements ChangeScene {
    @FXML
    public  Label titleLoginPage;

    public Button loginButton;
    public Button singInButton;
    public CheckBox OperatorCheckBox;


    @FXML
    private TextField lastNameInput;

    @FXML
    private TextField firstNameInput;

    private Scene scene;
    private Parent root;
    private BNIT pass;



    public void login(ActionEvent event){
        if (validUserInfo()){
            String filePath = "views/UserInterface.fxml";
            boolean isOperator = OperatorCheckBox.isSelected();
            String firstName = firstNameInput.getText();
            String lastName = lastNameInput.getText() ;
            if (isOperator) {

                Operator  operator  = new Operator(firstName,lastName,"Mindelo", OperatorCategory.AIR);
                filePath = "views/operatorInterface.fxml";

                try {
                    FXMLLoader fxmlLoader = changeScene(event, filePath);
                    OperationInterfaceController operationInterfaceController = fxmlLoader.getController();

                    operationInterfaceController.setOperator(operator);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }else {
                System.out.println("usario");

                Operator operator = new Operator("Nuno", "lima", "narnia", OperatorCategory.AIR);
                IslandTravel islandTravel = new IslandTravel("comprado", operator, "são vicente",
                        LocalDate.now(), LocalDate.now().plusDays(2), "santo antão");


                ArrayList<IslandTravel> IslandsTravels = new ArrayList<>();
                IslandsTravels.add(islandTravel);

                Holder holder = new Holder(firstName, lastName, "Mindelo", "eamil", 999999);
                BIUIslands pass = new BIUIslands(holder, IslandsTravels);

                try {
                    FXMLLoader fxmlLoader = changeScene(event, filePath);
                    UserInterfaceController userInterfaceController = fxmlLoader.getController();

                    userInterfaceController.setBUI(pass);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
    public void SignIn(ActionEvent event) {

        String filePath = "views/SignInUser.fxml";
        boolean isOperator = OperatorCheckBox.isSelected();
        if (isOperator) filePath = "views/SignInOperator.fxml";

        try {
            changeScene(event, filePath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
    public  boolean validUserInfo(){
        if(!(firstNameInput.getText().length() >0)) return false;
        return lastNameInput.getText().length() > 0;
    }


}

