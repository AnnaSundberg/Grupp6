module com.grupp.grupp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.persistence;


    opens com.grupp6.grupp6 to javafx.fxml;
    exports com.grupp6.grupp6;
}