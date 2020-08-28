/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author patan
 */
public class ConnectionProvider {

    public static Connection getCon()
    {
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
//            if(con!=null)
//            {
//                Statement st = con.createStatement();
//                return (Connection) st;
//            }
            return con;
        }catch(Exception e)
        {
            return null;
        }
    }
    
}
