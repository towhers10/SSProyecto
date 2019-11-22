
package controlasistencias;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionDB {
    
    public static Connection getConection(){

    Connection con = null;
    try{
        
               Class.forName("com.mysql.cj.jdbc.Driver");
               con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ccasistencia","root","");
               
        
    
    
    }catch(Exception e){
        System.out.println(e);
    
    
    }
    
    
    return con;
    
    }
    
}
