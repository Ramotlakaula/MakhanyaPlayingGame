module com.example.makhanyaplayinggame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.makhanyaplayinggame to javafx.fxml;
    exports com.example.makhanyaplayinggame;
}