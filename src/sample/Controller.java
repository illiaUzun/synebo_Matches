package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {
    Matches matches;

    @FXML
    private TextField factorialTextField;

    @FXML
    private TextField resultField;

    @FXML
    void onEnter(ActionEvent event) {
        resultField.clear();

        int num = Integer.parseInt(factorialTextField.getText());

        if (matches.validation(num)) {
            resultField.appendText(String.valueOf(matches.matches(num)));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Entered number can not be less then zero");
            alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        matches = new Matches();

        resultField.setEditable(false);
        resultField.setMouseTransparent(true);
        resultField.setFocusTraversable(false);
    }
}
