
package projy;

import java.sql.*;

public class DBConnect {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public DBConnect(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab", "root", "123456");
            
            stm = con.createStatement();
            
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        
    }
    
    public void getData(){
        
        try{
            
            String query = "select * from utente";
            rs = stm.executeQuery(query);
            System.out.println(rs);
            System.out.println("Record from Database");
            while(rs.next()){
                String Nome= rs.getString("Nome");
                String Cognome= rs.getString("Cognome");
                String Email= rs.getString("Email");
                System.out.println("Nome:"+Nome+"    "+"Cognome:"+Cognome+"   "+"Email:"+Email);
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
