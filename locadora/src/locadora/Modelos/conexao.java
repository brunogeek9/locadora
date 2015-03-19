/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author jamelle
 */
public class conexao {
    public static Connection main() {
        Connection con;
        Statement stmt;
        //ResultSet rs;
               
        try {            
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locadora","root","");
            stmt = con.createStatement();
            return con;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
