module ec.edu.espol.segundoparcialpoo {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.segundoparcialpoo to javafx.fxml;
    exports ec.edu.espol.segundoparcialpoo;
}
