/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projy;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author vjthe
 */
public class db_conn {
     
    private Connection con;
    private Statement stm;
    private ResultSet rs;    
 
     
    //public String getRisultato(){
    //    return this.risultato;
    //}    
    public db_conn(){
         
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
             
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab", "root", "123456");
            
            stm = con.createStatement();
             
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
         
    }
     
    public String[] login(String email, String pass){
        String IDutente = "";
        String categoria = "";
        String Utente[] = new String[2];
        try{            
            String query = "SELECT IDutente, categoria FROM utente WHERE (email = '"+email+"' AND password = MD5('"+pass+"'))";
            rs = stm.executeQuery(query);
            System.out.println("Record from Database");
            while(rs.next()){
                IDutente= rs.getString("IDutente");
                categoria= rs.getString("categoria");
                Utente[0]=IDutente;
                Utente[1]=categoria;
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
     return Utente;
    }
     
    public void register_stud(String Utente[]){
        String IDutente = "";
        try{
            
            String query1 = "INSERT INTO utente (nome, cognome, indirizzo, telefono, email, titolo_di_studio, codice_fiscale, categoria, password) VALUES ('"+Utente[0]+"', '"+Utente[1]+"', '"+Utente[2]+"', '"+Utente[3]+"', '"+Utente[4]+"', '"+Utente[5]+"', '"+Utente[6]+"', '"+Utente[7]+"', MD5('"+Utente[8]+"'))";
            stm.executeUpdate(query1);
            String query2 = "SELECT IDutente FROM utente WHERE email ='"+Utente[4]+"'";
            rs = stm.executeQuery(query2);
            rs.next();
            IDutente= rs.getString("IDutente");
            String query3 = "INSERT INTO studente (IDs, Tipo_di_corso, Corso_di_studio, Anno_corso) VALUES('"+IDutente+"', '"+Utente[9]+"', '"+Utente[10]+"', '"+Utente[11]+"')";
            stm.executeUpdate(query3);
            
            
           
        }catch(Exception ex){
            System.out.println(ex);
        }
         
    }
     
    public void register_prof(String Utente[]){
        String IDutente = "";
        try{
            String query1 = "INSERT INTO utente (nome, cognome, indirizzo, telefono, email, titolo_di_studio, codice_fiscale, categoria, password) VALUES ('"+Utente[0]+"', '"+Utente[1]+"', '"+Utente[2]+"', '"+Utente[3]+"', '"+Utente[4]+"', '"+Utente[5]+"', '"+Utente[6]+"', '"+Utente[7]+"', MD5('"+Utente[8]+"'))";
            stm.executeUpdate(query1);
            String query2 = "SELECT IDutente FROM utente WHERE email ='"+Utente[4]+"'";
            rs = stm.executeQuery(query2);
            rs.next();
            IDutente= rs.getString("IDutente");
            String query3 = "INSERT INTO docente_strutturato (IDds, profilo, dipartimento) VALUES('"+IDutente+"', '"+Utente[9]+"', '"+Utente[10]+"')";
            stm.executeUpdate(query3);
            
        }catch(Exception ex){
            System.out.println(ex);
        }  
         
    }
 public void crea_Progetto(String Progetto[], String IDds){
    String IDprogetto = "";
    String IDareatematica = "";
        try{
            String query1 = "INSERT INTO progetto (Data, Titolo, Descrizione, Tipologia, Durata, Posti, Privacy) VALUES ('"+Progetto[0]+"','"+Progetto[1]+"','"+Progetto[2]+"','"+Progetto[3]+"', '"+Progetto[4]+"', '"+Progetto[5]+"', '"+Progetto[6]+"')";
            stm.executeUpdate(query1);
            System.out.println(query1);
            String query2 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Progetto[1]+"'";
            rs = stm.executeQuery(query2);
            rs.next();
            IDprogetto= rs.getString("IDprogetto");
            String query3 = "INSERT INTO coordinatore (IDcoordinatore, IDprogetto) VALUES('"+IDds+"', '"+IDprogetto+"')";
            stm.executeUpdate(query3);
            String query4 = "INSERT INTO area_tematica (titolo) VALUES('"+Progetto[7]+"')";
            stm.executeQuery(query4);
            String query5 = "SELECT IDareatematica FROM area_tematica WHERE titolo ='"+Progetto[7]+"'";
            rs = stm.executeQuery(query5);
            rs.next();
            IDareatematica= rs.getString("IDareatematica");
            String query6 = "INSERT INTO tag_p (IDareatematica, IDprogetto) VALUES('"+IDareatematica+"','"+IDprogetto+"')";
            stm.executeUpdate(query6);
        }catch(Exception ex){
            System.out.println(ex);
            
            
        }
     
    }
     
    public void crea_Evento(String Evento[], String IDds){
    String IDevento = "";
    String IDareatematica = "";
        try{
            String query1 = "INSERT INTO evento (titolo, descrizione, data, ora, durata, posti, privacy) VALUES ('"+Evento[0]+"','"+Evento[1]+"','"+Evento[2]+"','"+Evento[3]+"', '"+Evento[4]+"', '"+Evento[5]+"', '"+Evento[6]+"')";
            
            stm.executeUpdate(query1);
            String query2 = "SELECT IDevento FROM evento WHERE titolo ='"+Evento[0]+"'";
            rs = stm.executeQuery(query2);
            rs.next();
            IDevento= rs.getString("IDevento");
            String query3 = "INSERT INTO moderatore (IDmoderatore, IDevento) VALUES('"+IDds+"', '"+IDevento+"')";
            stm.executeUpdate(query3);
            String query4 = "INSERT INTO area_tematica (titolo) VALUES('"+Evento[7]+"')";
            stm.executeUpdate(query4);
            String query5 = "SELECT IDareatematica FROM area_tematica WHERE titolo ='"+Evento[7]+"'";
            rs = stm.executeQuery(query5);
            rs.next();
            IDareatematica= rs.getString("IDareatematica");
            String query6 = "INSERT INTO tag_e (IDareatematica, IDevento) VALUES('"+IDareatematica+"','"+IDevento+"')";
            stm.executeUpdate(query6);
        }catch(Exception ex){
            System.out.println(ex);
        }
     
    }
    
//    public String ID(String Email){
//        String ID="";
//        try{
//            String query1 = "SELECT IDutente FROM utente WHERE email ='"+Email+"'";
//            rs = stm.executeQuery(query1);
//            rs.next();
//            ID= rs.getString("IDutente");
//        }catch(Exception ex){
//            System.out.println(ex);
//        }
//        return ID;
//    }
   
}




