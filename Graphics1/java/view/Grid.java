package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;


public class Grid extends Application {
    public static void main (String[] args) {
        launch(args);
    }
    
    @Override
    public void start (Stage stage) throws Exception {
        URL url = Grid.class.getResource("/FXML/Grid.fxml");
        GridPane root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}