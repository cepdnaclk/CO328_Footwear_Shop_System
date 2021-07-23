package UI.Table;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

// vm op
// --module-path /home/praveen/IdeaProjects/openjfx-11.0.2_linux-x64_bin-sdk/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml


import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;

public class Controller extends Application implements Runnable {

    @FXML
    public volatile Label Title  ;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Table.primaryStage = primaryStage   ;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Table/Table.fxml"));
        Table.primaryStage.setTitle("Hello World");
        Table.primaryStage.initStyle(StageStyle.TRANSPARENT);
        final Scene scene = new Scene(root);
        scene.setFill(null);

        Table.primaryStage.setScene(scene);

        Table.primaryStage.show();
    }
    public void initialize(){
        System.out.println(Title);
        Title.setText("title");
    }

    public void setTitle(String title ){
       // this.
        Title.setText("Prav");
        System.out.println("kk");
    }

    public void display(){

        launch();
    }


    public void test(MouseEvent mouseEvent) {
        System.out.println("close");
        Table.primaryStage.close();
    }

    public void run(){
        display();
    }

}
