package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionProvider 
{
    public static Connection getCon()
    {
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem","root","Panga@123");
         return con;
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e.toString());
         return null;
     }
    }
    
}
