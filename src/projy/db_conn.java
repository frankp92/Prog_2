/*
Sono presenti i seguenti metodi:
-   db_conn: connessione al DB
-   login: Query per effettuare il login che prende in input l'email e la pwd
-   register_stud: Query per la registrazione di uno studente, prende in input l'array contenente le info necessarie
-   register_prof: Query per la registrazione di uno professore, prende in input l'array contenente le info necessarie
-   crea_Progetto: Query per la creazione di un progetto, prende in input l'array contenente le info del progetto e l'ID del docente che l'ha creato
-   crea_Evento: Query per la creazione di un evento, prende in input l'array contenente le info del progetto e l'ID del docente che l'ha creato

 */
package projy;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
 
public class db_conn {
     
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public db_conn(){
         
        try{
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
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
            String query2 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Progetto[1]+"'";
            rs = stm.executeQuery(query2);
            rs.next();
            IDprogetto= rs.getString("IDprogetto");
            String query3 = "INSERT INTO coordinatore (IDcoordinatore, IDprogetto) VALUES('"+IDds+"', '"+IDprogetto+"')";
            stm.executeUpdate(query3);
            String query4 = "INSERT INTO area_tematica (titolo) VALUES('"+Progetto[7]+"')";
            stm.executeUpdate(query4);
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
    
    public void del_Progetto(String titolo){
        try{
            String query0 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+titolo+"'";
            rs = stm.executeQuery(query0);
            rs.next();
            String IDprogetto= rs.getString("IDprogetto");
            String query1 = "SELECT IDareatematica FROM tag_p WHERE IDprogetto ='"+IDprogetto+"'";
            rs = stm.executeQuery(query1);
            rs.next();
            String IDareatematica= rs.getString("IDareatematica");
            String query2 = "DELETE FROM tag_p WHERE IDprogetto = '"+IDprogetto+"'";
            stm.executeUpdate(query2);
            String query3 = "DELETE FROM area_tematica WHERE IDareatematica = '"+IDareatematica+"'";
            stm.executeUpdate(query3);            
            String query4 = "DELETE FROM coordinatore WHERE IDprogetto = '"+IDprogetto+"'";
            stm.executeUpdate(query4);            
            String query5 = "DELETE FROM progetto WHERE IDprogetto = '"+IDprogetto+"'";
            stm.executeUpdate(query5);           
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
    
    public void del_Evento(String titolo){
        try{
            String query0 = "SELECT IDevento FROM evento WHERE titolo ='"+titolo+"'";
            rs = stm.executeQuery(query0);
            rs.next();
            String IDevento= rs.getString("IDevento");
            String query1 = "SELECT IDareatematica FROM tag_e WHERE IDevento ='"+IDevento+"'";
            rs = stm.executeQuery(query1);
            rs.next();
            String IDareatematica= rs.getString("IDareatematica");
            String query2 = "DELETE FROM tag_e WHERE IDevento = '"+IDevento+"'";
            stm.executeUpdate(query2);
            String query3 = "DELETE FROM area_tematica WHERE IDareatematica = '"+IDareatematica+"'";
            stm.executeUpdate(query3);            
            String query4 = "DELETE FROM moderatore WHERE IDevento = '"+IDevento+"'";
            stm.executeUpdate(query4);            
            String query5 = "DELETE FROM evento WHERE IDevento = '"+IDevento+"'";
            stm.executeUpdate(query5);           
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}




