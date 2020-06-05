package smartlab.user;


import smartlab.user.User;
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
public class User_Studente extends User {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public User_Studente(){
    
        try{
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            stm = con.createStatement();
             
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }    
    
    public void User_Stud_Register(String Utente[]){
        
        String query_AddUtente;
        String query_IDutente;
        String query_AddStudente;
        String IDutente;
        
        try{
            
            query_AddUtente = "INSERT INTO utente (nome, cognome, indirizzo, telefono, email, titolo_di_studio, codice_fiscale, categoria, password) VALUES ('"+Utente[0]+"', '"+Utente[1]+"', '"+Utente[2]+"', '"+Utente[3]+"', '"+Utente[4]+"', '"+Utente[5]+"', '"+Utente[6]+"', '"+Utente[7]+"', MD5('"+Utente[8]+"'))";
            stm.executeUpdate(query_AddUtente);
            query_IDutente = "SELECT IDutente FROM utente WHERE email ='"+Utente[4]+"'";
            rs = stm.executeQuery(query_IDutente);
            rs.next();
            IDutente= rs.getString("IDutente");
            query_AddStudente = "INSERT INTO studente (IDs, Tipo_di_corso, Corso_di_studio, Anno_corso) VALUES('"+IDutente+"', '"+Utente[9]+"', '"+Utente[10]+"', '"+Utente[11]+"')";
            stm.executeUpdate(query_AddStudente);
            System.out.println("Registrazione dell'utente: "+Utente[4]+" effettuata correttamente");
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    
    
}
