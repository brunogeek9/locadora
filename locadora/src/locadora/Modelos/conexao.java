/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jamelle
 */
public class conexao {
    Connection con;
    Statement stmt;
    ResultSet rs;
    public conexao() {
     try {            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locadora","root","");
            stmt = con.createStatement();                            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }        
    }
    public void inserirFilme(Filme f){
        try {
            String q = "insert into filme(nome,duracao) values('" + f.getNome()+ "','" + f.getDuracao()+ "')";;
            stmt.executeUpdate(q);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
