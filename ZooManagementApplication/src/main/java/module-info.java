module com.example.zoomanagementapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zoomanagementapplication to javafx.fxml;
    exports com.example.zoomanagementapplication;
    exports Model;
    opens Model to javafx.fxml;
    exports Controllers;
    opens Controllers to javafx.fxml;
}