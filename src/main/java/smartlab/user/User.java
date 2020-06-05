package smartlab.user;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vjthe
 */
public class User {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public User(){
    
        try{
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root1", "123456");
            stm = con.createStatement();
             
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public String[] Login(String email, String pass){

        String query_Login;
        String IDutente;
        String categoria;
        String Utente[] = new String[2];

        try{            

            query_Login = "SELECT IDutente, categoria FROM utente WHERE (email = '"+email+"' AND password = MD5('"+pass+"'))";
            rs = stm.executeQuery(query_Login);

            while(rs.next()){

                IDutente= rs.getString("IDutente");
                categoria= rs.getString("categoria");
                Utente[0]=IDutente;
                Utente[1]=categoria;
                System.out.println("Login effettuato correttamente");
            }

        }catch(Exception ex){
            System.out.println(ex);
        }

        return Utente;
    }
    
    public boolean check_Registrazione(String codice_fiscale){
        
        boolean check = false;
    
        try{            

            String query_check = "SELECT IDutente FROM utente WHERE codice_fiscale = '"+codice_fiscale+"'";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
    
        return check;
    }
    
    public String get_User_ID(String email){
    
        String ID = null;
        
        try{            

            String query_id = "SELECT IDutente FROM utente WHERE email ='"+email+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            ID = rs.getString("IDutente");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return ID;    
    
    }
    
    public String get_User_Categoria(String email){
    
        String categoria = null;
        
        try{            

            String query_id = "SELECT categoria FROM utente WHERE email ='"+email+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            categoria = rs.getString("categoria");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return categoria;    
    
    }
    
}