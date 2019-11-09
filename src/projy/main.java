package projy;

import java.util.Arrays;

public class main {

  
    public static void main(String[] args) {
        
     

        String utente[];
        db_conn connect= new db_conn();
        System.out.println(connect);
        String email = "primo@professore";
        String pass = "123456";
        utente = connect.login(email, pass);
        System.out.print(Arrays.toString(utente));

        //connect.getData();

    }

    
}
