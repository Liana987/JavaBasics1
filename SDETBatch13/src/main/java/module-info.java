module com.example.sdetbatch13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sdetbatch13 to javafx.fxml;
    exports com.example.sdetbatch13;
}