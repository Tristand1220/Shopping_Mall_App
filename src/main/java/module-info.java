module com.example.mall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mall to javafx.fxml;
    exports com.example.mall;
}