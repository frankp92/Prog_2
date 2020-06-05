package smartlab;

/*
Sono presenti i seguenti metodi:
-   Service_Database: connessione al DB
-   User_Login: Query per effettuare il User_Login che prende in input l'email e la pwd
-   User_Stud_Register: Query per la registrazione di uno studente, prende in input l'array contenente le info necessarie
-   User_Prof_Register: Query per la registrazione di uno professore, prende in input l'array contenente le info necessarie
-   Pj_New: Query per la creazione di un progetto, prende in input l'array contenente le info del progetto e l'ID del docente che l'ha creato
-   Ev_New: Query per la creazione di un evento, prende in input l'array contenente le info del progetto e l'ID del docente che l'ha creato

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Service_Database {
     
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public Service_Database(){
    
        try{
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            stm = con.createStatement();
             
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public void Close_connection(){
        
        try {
            
            if (con != null) {
                con.close();
            }
            if (stm != null) {
                stm.close();
            }
            
        } catch (SQLException sqlee) {
            sqlee.printStackTrace();
        }    
    }
    
    public void ExecuteUpdate(String query){
    
        try {
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Service_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}