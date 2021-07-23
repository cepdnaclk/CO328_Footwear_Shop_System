package UI.Login;

import UI.Table.Table;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Table.primaryStage = primaryStage   ;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Login/Login.fxml")); //"Table/Table.fxml"));
        Table.primaryStage.setTitle("Hello World");
        Table.primaryStage.initStyle(StageStyle.TRANSPARENT);
        final Scene scene = new Scene(root);
        scene.setFill(null);

        Table.primaryStage.setScene(scene);

        Table.primaryStage.show();
    }
}
