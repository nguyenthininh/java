package jv2_assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage mainStage;

    public void start (Stage primaryStage){
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("table.fxml"));
            primaryStage.setTitle("quan li sinh vien");
            primaryStage.setScene(new Scene(root,700,500));
            primaryStage.show();
        }catch (Exception e){

        }


    }


    public static void main(String[] args) {
        launch(args);
    }


}
