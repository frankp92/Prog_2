package smartlab.pj;

import smartlab.Service_Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Project {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public Project(){
    
        try{
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            stm = con.createStatement();
             
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public void Pj_New(String Progetto[], String email){
        
        Service_Database DB = new Service_Database();
        
        String query_AddProgetto;
        String query_AddCoordinatore;
        String query_AddAreaTematica;
        String query_AddTagP;
        String IDprogetto;
        String IDareatematica;
        String IDds = get_User_ID(email);
            
        query_AddProgetto = "INSERT INTO progetto (Data, Titolo, Descrizione, Tipologia, Durata, Posti, Privacy) VALUES ('"+Progetto[0]+"','"+Progetto[1]+"','"+Progetto[2]+"','"+Progetto[3]+"', '"+Progetto[4]+"', '"+Progetto[5]+"', '"+Progetto[6]+"')";
        DB.ExecuteUpdate(query_AddProgetto);
        IDprogetto = get_Pj_ID(Progetto[1]);
        query_AddCoordinatore = "INSERT INTO coordinatore (IDcoordinatore, IDprogetto) VALUES('"+IDds+"', '"+IDprogetto+"')";
        DB.ExecuteUpdate(query_AddCoordinatore);
        query_AddAreaTematica = "INSERT INTO area_tematica (titolo) VALUES('"+Progetto[7]+"')";
        DB.ExecuteUpdate(query_AddAreaTematica);
        IDareatematica = get_AreaTematica_ID(Progetto[7]);
        query_AddTagP = "INSERT INTO tag_p (IDareatematica, IDprogetto) VALUES('"+IDareatematica+"','"+IDprogetto+"')";
        DB.ExecuteUpdate(query_AddTagP);
        System.out.println("Creazione del Progetto: "+Progetto[1]+" effettuata correttamente");
    }
    
   public void Pj_Modify(String Progetto[]){
        
        String query_UpdateProgetto;
        
        try{
            
            query_UpdateProgetto = "UPDATE progetto SET Descrizione = '"+Progetto[0]+"', Durata = '"+Progetto[1]+"', Posti = '"+Progetto[2]+"'WHERE `IDprogetto`=(SELECT IDprogetto FROM progetto WHERE Titolo='"+Progetto[3]+"')";
            stm.executeUpdate(query_UpdateProgetto);
                        
            System.out.println("Modifica del Progetto: "+Progetto[3]+" effettuata correttamente");
        
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void Pj_Del(String Titolo){
        
        Service_Database DB = new Service_Database();
        
        String delete_tag;
        String delete_areatematica;
        String delete_coordinatore;
        String delete_progetto;
        String query_tipologia;
        String query_task;
        String IDprogetto = get_Pj_ID(Titolo);
        String Tipologia = get_Pj_Tipologia(Titolo);
        String IDareatematica = get_Tag_ID(IDprogetto);
        
        delete_tag = "DELETE FROM tag_p WHERE IDprogetto = '"+IDprogetto+"'";
        DB.ExecuteUpdate(delete_tag);
        delete_areatematica = "DELETE FROM area_tematica WHERE IDareatematica = '"+IDareatematica+"'";
        DB.ExecuteUpdate(delete_areatematica);            
        delete_coordinatore = "DELETE FROM coordinatore WHERE IDprogetto = '"+IDprogetto+"'";
        DB.ExecuteUpdate(delete_coordinatore);

        if (Tipologia.equals("Tesi")) {

            query_tipologia = "DELETE FROM tesi WHERE IDprogetto = '"+IDprogetto+"'";
            DB.ExecuteUpdate(query_tipologia);

        } else if (Tipologia.equals("Tirocinio")) {

            query_tipologia = "DELETE FROM tirocinio WHERE IDprogetto = '"+IDprogetto+"'";
            DB.ExecuteUpdate(query_tipologia);

        } else if (Tipologia.equals("Lavoro")) {

            query_tipologia = "DELETE FROM lavoro WHERE IDprogetto = '"+IDprogetto+"'";
            DB.ExecuteUpdate(query_tipologia);

        }

        query_task = "DELETE FROM task WHERE IDprogetto = '"+IDprogetto+"'";
        DB.ExecuteUpdate(query_task);
        delete_progetto = "DELETE FROM progetto WHERE IDprogetto = '"+IDprogetto+"'";
        DB.ExecuteUpdate(delete_progetto);
        System.out.println("Eliminazione del Progetto: "+Titolo+" effettuata correttamente");
    }
    
    public void set_Pj_Posti_Join(String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
    
        String query_checkPartecipazione = "UPDATE progetto SET posti = posti-1 WHERE IDprogetto = '"+Pj_ID+"'";
        DB.ExecuteUpdate(query_checkPartecipazione);
    
    }
    
    public void set_Pj_Posti_UnJoin(String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
    
        String query_checkPartecipazione = "UPDATE progetto SET posti = posti+1 WHERE IDprogetto = '"+Pj_ID+"'";
        DB.ExecuteUpdate(query_checkPartecipazione);
    
    }
    
    public void Pj_Lavoro_Join(String User_Email, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String update_Posti = "INSERT INTO lavoro (IDlavoratore, IDprogetto) VALUES ('"+User_ID+"', '"+Pj_ID+"')";
        DB.ExecuteUpdate(update_Posti);
    
    }
    
    public void Pj_Lavoro_UnJoin(String User_Email, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String update_Posti = "DELETE FROM lavoro WHERE IDlavoratore = '"+User_ID+"' AND IDprogetto = '"+Pj_ID+"'";
        DB.ExecuteUpdate(update_Posti);
    
    }
    
    public void Pj_Tesi_Join(String User_Email, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String update_Posti = "INSERT INTO tesi (IDtesista, IDprogetto) VALUES ('"+User_ID+"', '"+Pj_ID+"')";
        DB.ExecuteUpdate(update_Posti);
    
    }
    
    public void Pj_Tesi_UnJoin(String User_Email, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String update_Posti = "DELETE FROM tesi WHERE IDtesista = '"+User_ID+"' AND IDprogetto = '"+Pj_ID+"'";
        DB.ExecuteUpdate(update_Posti);
    
    }
    
    public void Pj_Tirocinio_Join(String User_Email, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String update_Posti = "INSERT INTO tirocinio (IDtirocinante, IDprogetto) VALUES ('"+User_ID+"', '"+Pj_ID+"')";
        DB.ExecuteUpdate(update_Posti);
    
    }
    
    public void Pj_Tirocinio_UnJoin(String User_Email, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String update_Posti = "DELETE FROM tirocinio WHERE IDtirocinante = '"+User_ID+"' AND IDprogetto = '"+Pj_ID+"'";
        DB.ExecuteUpdate(update_Posti);
    
    }
    
    public boolean check_Pj_Coordinatore(String titolo, String User_Email){
        
        boolean check = false;
        String Pj_ID = get_Pj_ID(titolo);
        String User_ID = get_User_ID(User_Email);
    
        try{            

            String query_check = "SELECT IDcoordinatore, IDprogetto FROM coordinatore WHERE (IDcoordinatore = '"+User_ID+"' AND IDprogetto = '"+Pj_ID+"')";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public boolean check_Pj_Lavoratore(String Pj_Titolo, String User_Email){
        
        boolean check = false;
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        try{            

            String query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+User_ID+"' AND IDprogetto ='"+Pj_ID+"'";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public boolean check_Pj_Tesista(String Pj_Titolo, String User_Email){
        
        boolean check = false;
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        try{            

            String query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+User_ID+"' AND IDprogetto ='"+Pj_ID+"'";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public boolean check_Pj_Tirocinante(String Pj_Titolo, String User_Email){
        
        boolean check = false;
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        try{            

            String query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+User_ID+"' AND IDprogetto ='"+Pj_ID+"'";
            rs = stm.executeQuery(query_check);
            check = rs.next();

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public boolean check_ML_User(String ML_Titolo, String User_Email, String Pj_Titolo){
        
        boolean check = false;
        String ML_ID = get_Milestone_ID(ML_Titolo);
        String User_ID = get_User_ID(User_Email);
        String Pj_ID = get_Pj_ID(Pj_Titolo);
    
        try{            

            String query_check = "SELECT IDutente FROM task WHERE IDmilestone ='"+ML_ID+"' AND IDprogetto='"+Pj_ID+"'";
            rs = stm.executeQuery(query_check);
            String ID_check = rs.getString("IDutente");
            
            if(User_ID==ID_check){check=true;}

        }catch(Exception ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public void Pj_GDriveFolderID(String FolderID, String Titolo){
        
        Service_Database DB = new Service_Database();
        
        String query_AddIDGDrive;
            
        query_AddIDGDrive = "UPDATE `coordinatore` SET `GDriveID`='"+FolderID+"' WHERE `IDprogetto`=(SELECT IDprogetto FROM progetto WHERE Titolo='"+Titolo+"')";
        DB.ExecuteUpdate(query_AddIDGDrive);
    }
    
    public void Milestone_New(String ML_Task, String Pj_Titolo){
    
        Service_Database DB = new Service_Database();
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        
        String query_AddMilestone = "INSERT INTO milestone (Milestone, Status) VALUES ('"+ML_Task+"', 'Non iniziata')";
        DB.ExecuteUpdate(query_AddMilestone);
        String ML_ID = get_Milestone_ID(ML_Task);
        String query_AddTask = "INSERT INTO task (IDmilestone, IDprogetto) VALUES('"+ML_ID+"', '"+Pj_ID+"')";
        DB.ExecuteUpdate(query_AddTask);
        
    }
    
    public void Milestone_Del(String ML_Task, String Pj_Titolo){
    
        Service_Database DB = new Service_Database();
        
        String ML_ID = get_Milestone_ID(ML_Task);
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        
        String query_DeleteTask = "DELETE FROM task WHERE IDmilestone='"+ML_ID+"' AND IDprogetto = '"+Pj_ID+"'";
        DB.ExecuteUpdate(query_DeleteTask);
        String query_DeleteMilestone = "DELETE FROM milestone WHERE Milestone = '"+ML_Task+"'";
        DB.ExecuteUpdate(query_DeleteMilestone);
    }
    
    public void Milestone_Join(String User_Email, String ML_Titolo, String Pj_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String ML_ID = get_Milestone_ID(ML_Titolo);
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String User_ID = get_User_ID(User_Email);
    
        String query2 = "UPDATE task SET IDutente ='"+User_ID+"' WHERE IDmilestone ='"+ML_ID+"' AND IDprogetto='"+Pj_ID+"'";
        DB.ExecuteUpdate(query2);
        String query3 = "UPDATE milestone SET Status ='In Progress' WHERE IDmilestone ='"+ML_ID+"'";
        DB.ExecuteUpdate(query3);
    
    }
    
    public void Milestone_Complete(String ML_Titolo){
        
        Service_Database DB = new Service_Database();
        
        String ML_ID = get_Milestone_ID(ML_Titolo);
    
        String query3 = "UPDATE milestone SET Status ='Complete' WHERE IDmilestone ='"+ML_ID+"'";
        DB.ExecuteUpdate(query3);
    
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
    
    private String get_Pj_ID(String Pj_Titolo){
    
        String Pj_ID = null;
        
        try{            

            String query_id = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Pj_Titolo+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            Pj_ID = rs.getString("IDprogetto");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return Pj_ID;
    }
    
    private String get_Pj_Tipologia(String Pj_Titolo){
    
        String Pj_Tipologia = null;
        
        try{            

            String query_tipologia = "SELECT tipologia FROM progetto WHERE titolo ='"+Pj_Titolo+"'";
            rs = stm.executeQuery(query_tipologia);
            rs.next();
            Pj_Tipologia = rs.getString("tipologia");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return Pj_Tipologia;
    }
    
    private String get_AreaTematica_ID(String AT_Titolo){
    
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
    
    private String get_Milestone_ID(String ML_Titolo){
    
        String ML_ID = null;
        
        try{            

            String query_id = "SELECT IDmilestone FROM milestone WHERE Milestone ='"+ML_Titolo+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            ML_ID = rs.getString("IDmilestone");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return ML_ID;
    }
    
    private String get_Tag_ID(String Pj_Titolo){
    
        String Tag_ID = null;
        String Pj_ID =  get_Pj_ID(Pj_Titolo);
        
        try{            

            String query_id = "SELECT IDareatematica FROM tag_p WHERE IDprogetto ='"+Pj_ID+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            Tag_ID = rs.getString("IDareatematica");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return Tag_ID;
    }
}
