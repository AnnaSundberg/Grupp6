module com.grupp6.grupp6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.grupp6.grupp6 to javafx.fxml;
    exports com.grupp6.grupp6;
}