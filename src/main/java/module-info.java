module com.example.hesapmakinasi2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator4 to javafx.fxml;
    exports com.example.calculator4;
}