package sk.kosickaakademia.matolak.chat.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sk.kosickaakademia.matolak.chat.database.Database;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Chat");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Database db=new Database();
        db.insertNewUser("Adam","heslo");
        db.loginUser("Adam","heslo");
    }
}
