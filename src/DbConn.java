
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class DbConn {
    static Connection conn = null;
    public static Connection getCon(){
        try {
           
            conn=DriverManager.getConnection("jdbc:sqlite:Lib.sqlite");
            return conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
           return conn;
        }
    
    
    
    }
}
