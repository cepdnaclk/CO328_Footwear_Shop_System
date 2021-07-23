package ServerPort;

public class ServerLogin {

    public ServerLogin(){

    }

    public static boolean Authentication( String user, String password ){
        boolean Auth = false ;

        if(user.equals("praveen")) {
            if (password.equals("1234")) {

                Auth = true;
            }
        }


        return Auth ;

    }

}
