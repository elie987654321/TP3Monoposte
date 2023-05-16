package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ApplicationController extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Facturation");

        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("../view/Application.fxml"));

        Scene scene = new Scene(fxmlLoader1.load());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
