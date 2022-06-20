module com.example.bilhetenacinaldetrasportsbnit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bilhetenacinaldetrasportsbnit to javafx.fxml;
    exports com.bilhetenacinaldetrasportsbnit;
    exports com.bilhetenacinaldetrasportsbnit.Controller;
    opens com.bilhetenacinaldetrasportsbnit.Controller to javafx.fxml;
}