package ua.chillcrew.archivec.core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ua.chillcrew.archivec.ui.controllers.MainController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../ui/forms/Main.fxml"));
        primaryStage.setTitle("Archivec");
        primaryStage.setScene(new Scene(root, 800, 600));

        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(400);

        MainController.setStage(primaryStage);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
