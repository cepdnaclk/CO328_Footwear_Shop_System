import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import security.Rpc ;

import java.io.IOException;
import java.util.ArrayList ;


public class MainController {

    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public AnchorPane MainWindow;

    private ArrayList<ImageView> imageView = new ArrayList<ImageView>() ;
    private List naviList[] ;

    @FXML
    public void initialize() {
        imageView.add( image1) ;
        imageView.add( image2) ;
        imageView.add( image3) ;
        imageView.add( image4) ;
        imageView.add( image5) ;


        String userLevel[] = Rpc.userAllowed(); // navigation bar

        naviList = new List[userLevel.length];
        for( int i  = 0 ; i < userLevel.length ; i++  ){
           naviList[i] = new List(userLevel[i]) ;
            imageView.get(i).setImage(naviList[i].getImage());

        }

    }

    public void listButton1(MouseEvent mouseEvent) {

    }

    public void listButton2(MouseEvent mouseEvent) {
        naviList[1].run(mouseEvent);
    }

    public void listButton3(MouseEvent mouseEvent) {
    }

    public void listButton4(MouseEvent mouseEvent) {
    }

    public void listButton5(MouseEvent mouseEvent) {
    }
}


class List{

    private String name = "" ;
    private String photo = "/image/home.png" ;
    private String xml = "" ;

    List(String name){
        this.name = name ;
        switch (name){
            case "billing":
                photo = "/image/billing.png" ;
                xml = "screen/Billing/Top.fxml";
                break;
            case ("test"):
                photo = "" ;
                break;
            default:
                System.out.println(name);
                photo = "/image/home.png" ;
        }

    }

    public Image getImage() {
        Image image = new Image(this.photo);
        return image;
    }

    public void run( MouseEvent mouseEvent){
        Parent root = null;


        try {
            root = FXMLLoader.load(getClass().getResource(xml));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        //  scene.getStylesheets().add(getClass().getResource("theme.css").toExternalForm());
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow() ;
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
    }

}

