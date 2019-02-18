/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;

/**
 *
 * @author hnd
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBConnection
{
    
    private Connection getConnection() throws Exception
    {
        
        String driver="sun.jdbc.odbc.JdbcOdbcDriver";
        String url="jdbc:odbc:OOP77";
        
        String username="hnd";
        String password="hnd";
        
        Class.forName(driver);
        
        return DriverManager.getConnection(url, username, password);
        
    }
    
    public void addValue(String SQL) throws Exception
    {
        Connection conn=getConnection();
        Statement st=conn.createStatement();
        st.executeUpdate(SQL);
        conn.close();
        
    }
}
