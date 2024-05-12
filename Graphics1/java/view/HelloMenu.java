package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;


public class HelloMenu extends Application {
    public static Stage stage;
    public static void main (String[] args) {
        launch(args);
    }
    
    @Override
    public void start (Stage stage) throws Exception {
        HelloMenu.stage = stage;
        URL url = HelloMenu.class.getResource("/FXML/Hello.fxml");
        BorderPane root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}