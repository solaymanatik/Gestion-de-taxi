package gestion_de_taxi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ConnectionBD {
    public static Connection getConnection(){
        Connection connection = null;
       try{
        connection  = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/gestion_de_taxi", "root", "" ); 
        
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage() );
       }
       return connection;
    }

    
    
}
