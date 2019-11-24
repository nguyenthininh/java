package fa_assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    public class Main extends Application {
        public static Stage mainStage;

        public void start (Stage primaryStage) throws Exception{
            mainStage = primaryStage;
         Parent root = FXMLLoader.load(getClass().getResource("time.fxml"));
            primaryStage.setTitle("time");
            primaryStage.setScene(new Scene(root,700,500));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }
    }
