package smartlab.ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import smartlab.Service_Database;

public class Event {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public Event(){
    
        try{
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            stm = con.createStatement();
             
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public void Ev_New(String Evento[], String email){    
        
        Service_Database DB = new Service_Database();
        
        String User_ID = get_User_ID(email);
        String query1;
        String query3;
        String query4;
        String query6;
        String IDevento;
        String IDareatematica;
            
        query1 = "INSERT INTO evento (titolo, descrizione, data, ora, durata, posti, privacy) VALUES ('"+Evento[0]+"','"+Evento[1]+"','"+Evento[2]+"','"+Evento[3]+"', '"+Evento[4]+"', '"+Evento[5]+"', '"+Evento[6]+"')";
        DB.ExecuteUpdate(query1);
        IDevento= get_Ev_ID(Evento[0]);
        query3 = "INSERT INTO moderatore (IDmoderatore, IDevento) VALUES('"+User_ID+"', '"+IDevento+"')";
        DB.ExecuteUpdate(query3);
        query4 = "INSERT INTO area_tematica (titolo) VALUES('"+Evento[7]+"')";
        DB.ExecuteUpdate(query4);
        IDareatematica= get_AT_ID(Evento[7]);
        query6 = "INSERT INTO tag_e (IDareatematica, IDevento) VALUES('"+IDareatematica+"','"+IDevento+"')";
        DB.ExecuteUpdate(query6);
        System.out.println("Creazione dell'Evento: "+Evento[0]+" effettuata correttamente");
    }
    
    public void Ev_Del(String titolo){
        
        Service_Database DB = new Service_Database();
        
        String delete_tag;
        String delete_areatematica;
        String delete_moderatore;
        String delete_partecipanti;
        String delete_evento;
        String IDevento;
        String IDtag;
            
        IDevento = get_Ev_ID(titolo);
        IDtag = get_Tag_ID(IDevento);
        delete_tag = "DELETE FROM tag_e WHERE IDevento = '"+IDevento+"'";
        DB.ExecuteUpdate(delete_tag);
        delete_areatematica = "DELETE FROM area_tematica WHERE IDareatematica = '"+IDtag+"'";
        DB.ExecuteUpdate(delete_areatematica);            
        delete_moderatore = "DELETE FROM moderatore WHERE IDevento = '"+IDevento+"'";
        DB.ExecuteUpdate(delete_moderatore); 
        delete_partecipanti = "DELETE FROM partecipa WHERE IDevento = '"+IDevento+"'";
        DB.ExecuteUpdate(delete_partecipanti); 
        delete_evento = "DELETE FROM evento WHERE IDevento = '"+IDevento+"'";
        DB.ExecuteUpdate(delete_evento);
        System.out.println("Eliminazione dell'Evento: "+titolo+" effettuata correttamente");
    }
    
    public void Ev_Join(String User_Email, String Ev_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Ev_ID = get_Ev_ID(Ev_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        set_Ev_Posti_Join(Ev_Titolo);
        String query_partecipazione = "INSERT INTO partecipa (IDpartecipante, IDevento) VALUES ('"+User_ID+"', '"+Ev_ID+"')";
        DB.ExecuteUpdate(query_partecipazione);
    
    }
    
    public void Ev_UnJoin(String User_Email, String Ev_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Ev_ID = get_Ev_ID(Ev_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        set_Ev_Posti_UnJoin(Ev_Titolo);
        String query_partecipazione = "DELETE FROM partecipa WHERE IDpartecipante = '"+User_ID+"' AND IDevento = '"+Ev_ID+"'";
        DB.ExecuteUpdate(query_partecipazione);
    
    }
    
    private String get_User_ID(String User_Email){
    
        String User_ID = null;
        
        try{            

            String query_id = "SELECT IDutente FROM utente WHERE email ='"+User_Email+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            User_ID = rs.getString("IDutente");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return User_ID;    
    
    }
    
    private String get_Ev_ID(String Ev_Titolo){
    
        String Ev_ID = null;
        
        try{            

            String query_id = "SELECT IDevento FROM evento WHERE titolo ='"+Ev_Titolo+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            Ev_ID = rs.getString("IDevento");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return Ev_ID;
    }
    
    private String get_AT_ID(String AT_Titolo){
    
        String AT_ID = null;
        
        try{            

            String query_id = "SELECT IDareatematica FROM area_tematica WHERE titolo ='"+AT_Titolo+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            AT_ID = rs.getString("IDareatematica");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return AT_ID;
    }
    
    private String get_Tag_ID(String Ev_ID){
    
        String Tag_ID = null;
        
        try{            

            String query_id = "SELECT IDareatematica FROM tag_e WHERE IDevento ='"+Ev_ID+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            Tag_ID = rs.getString("IDareatematica");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return Tag_ID;
    }
    
    public void set_Ev_Posti_Join(String Ev_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Ev_ID = get_Ev_ID(Ev_Titolo);
    
        String query_posti = "UPDATE evento SET posti = posti-1 WHERE IDevento = '"+Ev_ID+"'";
        DB.ExecuteUpdate(query_posti);
    }
    
    public void set_Ev_Posti_UnJoin(String Ev_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Ev_ID = get_Ev_ID(Ev_Titolo);
    
        String query_posti = "UPDATE evento SET posti = posti+1 WHERE IDevento = '"+Ev_ID+"'";
        DB.ExecuteUpdate(query_posti);
    }
    
    public boolean check_Moderatore(String Ev_Titolo, String User_Email){
        
        boolean check = false;
        String Ev_ID = get_Ev_ID(Ev_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        try{            

            String query_check = "SELECT IDmoderatore, IDevento FROM moderatore WHERE (IDmoderatore = '"+User_ID+"' AND IDevento = '"+Ev_ID+"')";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public boolean check_Ev_Join(String Ev_Titolo, String User_Email){
        
        boolean check = false;
        String User_ID = get_User_ID(User_Email);
        String Ev_ID = get_Ev_ID(Ev_Titolo);
    
        try{            

            String query_check = "SELECT IDpartecipante, IDevento FROM partecipa WHERE IDpartecipante ='"+User_ID+"' AND IDevento='"+Ev_ID+"'";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
}