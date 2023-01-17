package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
    
    Connection con = null;
    
    public static Connection connectDB(){
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:Database.db");
            System.out.println("Connection Succesful");
            
            return con;
        
        }catch(Exception b){
            System.out.println("Connection Failed"+b);
            return null;
        }
        
    }
    
    public static void main(String[] args) {
        connectDB();
    }
    
}
