package org.example;

import controller.HanoiController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.HanoiModel;
import view.HanoiView;

public class HanoiApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HanoiModel model = new HanoiModel();
        HanoiView view = new HanoiView();
        new HanoiController(model, view, primaryStage);

        primaryStage.setTitle("Torres de Hanoi Automático");
        primaryStage.setScene(view.getScene());
        primaryStage.show();
    }
}