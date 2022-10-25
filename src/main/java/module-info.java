module com.example.sla {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sla to javafx.fxml;
    exports com.example.sla;
}