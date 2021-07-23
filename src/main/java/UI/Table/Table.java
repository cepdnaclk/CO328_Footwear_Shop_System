package UI.Table;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.concurrent.TimeUnit;

public class Table  {

    public static Stage primaryStage;
    private static Controller controller = new Controller();


    public static void main(String[] args) {


        Thread thread = new Thread(controller);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("tt");
        

    }




}
