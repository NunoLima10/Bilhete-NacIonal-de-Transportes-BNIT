package com.bilhetenacinaldetrasportsbnit.Model.interfaces;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public interface ChangeScene {



    FXMLLoader changeScene(ActionEvent event, String filepath) throws IOException;
}
// tive a ideia de implemntar essa interface para que todos os meus controllers