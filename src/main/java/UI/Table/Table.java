package UI.Table;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Table extends Application{
    public int print(){
        return  0 ;
    }

    public int print1(){
        return  0 ;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Table.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        final Scene scene = new Scene(root);
        scene.setFill(null);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void display(){


        launch();
    }

    public static void main(String[] args) {
        Table table = new Table();
        table.display();

    }


}
