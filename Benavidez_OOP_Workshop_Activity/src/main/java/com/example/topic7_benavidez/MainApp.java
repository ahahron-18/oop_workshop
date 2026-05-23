package com.example.topic7_benavidez;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader welcomeLoader = new FXMLLoader(MainApp.class.getResource("welcome-view.fxml"));
        Scene welcomeScene = new Scene(welcomeLoader.load());


        Button btnProceed = (Button) welcomeScene.lookup("#btnProceed");

        btnProceed.setOnAction(event -> {
            try {
                FXMLLoader systemLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
                Scene systemScene = new Scene(systemLoader.load());

                stage.setScene(systemScene);
                stage.setTitle("Student Management System");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        stage.setTitle("Welcome");
        stage.setScene(welcomeScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}