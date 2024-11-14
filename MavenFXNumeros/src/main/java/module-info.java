module Principal {
    requires javafx.controls;
    requires javafx.fxml;

    opens Controller to javafx.fxml;
    exports Principal;
}
