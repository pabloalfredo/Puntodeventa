package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
	
	private Connection cn;
    private static String URL ="jdbc:mysql://localhost/dbtienda";
    private static String USUARIO = "usuario";
    private static String PASSWORD ="12345";
    
    public void  open(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection(URL, USUARIO, PASSWORD);        
        }catch(Exception ex){
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public ResultSet query (String sql){
        ResultSet rs;
        try{
            rs =cn.createStatement().executeQuery(sql);
            return rs;
        }catch(SQLException e){}
            return null;
    }
    
    public void execute (String sql){
        try{
            cn.createStatement().execute(sql);
       }catch(SQLException e){}
    }
    
    public void close (){
        cn=null;
    }
}
