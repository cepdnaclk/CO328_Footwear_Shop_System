package UI.Login;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import ServerPort.* ;

public class Controller {
    public TextArea User;
    public PasswordField password;
    public Label Login;

    ServerLogin serverLogin = new ServerLogin() ;

    private void login(){
        Dialog<ButtonType> alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Login");
        alert.setContentText("Ok");
        alert.showAndWait();
    }

    public void Login(MouseEvent mouseEvent) {
        String userName = User.getText();
        String passWord = password.getText();
        System.out.println(userName+"   "+passWord );

        if ( serverLogin.Authentication(userName, passWord)){
            Login.setText("OK");
            login();
        }else {


            Dialog<ButtonType> alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incorrect credentials");
            alert.setContentText("Your password or user is incorrect.");
            alert.showAndWait();
        }
    }


}
