package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import model.Validation;

public class HelloController {
    public PasswordField password;
    public TextField username;
    
    public void signUp (MouseEvent mouseEvent) {
        if (username.getText().length() <= 4) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid Username");
            alert.setHeaderText("Invalid Username");
            alert.setContentText("Check you username length");
            alert.show();
            return;
        }
        if (!Validation.check(password.getText(), Validation.STRONG_PASSWORD)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Weak Password");
            alert.setHeaderText("Weak Password");
            alert.setContentText("Weak Password");
            alert.show();
            return;
        }
        SecondMenu secondMenu = new SecondMenu();
        try {
            secondMenu.start(HelloMenu.stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void reset (MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Are you sure you want to reset?");
        alert.showAndWait();
        if (alert.getResult().getButtonData() == ButtonBar.ButtonData.CANCEL_CLOSE) return;
        username.setText("");
        password.setText("");
    }
}
