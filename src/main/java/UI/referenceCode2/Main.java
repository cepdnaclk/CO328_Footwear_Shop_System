package UI.referenceCode2;

import UI.Table.Table;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

// vm op
// --module-path /home/praveen/IdeaProjects/openjfx-11.0.2_linux-x64_bin-sdk/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Table.primaryStage = primaryStage   ;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Table/Table.fxml"));
        Table.primaryStage.setTitle("Hello World");
        Table.primaryStage.initStyle(StageStyle.TRANSPARENT);
        final Scene scene = new Scene(root);
        scene.setFill(null);

        Table.primaryStage.setScene(scene);

        Table.primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
