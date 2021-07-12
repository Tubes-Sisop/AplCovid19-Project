/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplcovid19.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
        
/**
 * 
 * @author RACHMAN
 */
public class koneksi {
    public Connection con;
    public Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_covid19", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}