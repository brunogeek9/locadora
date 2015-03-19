/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.DAO;


import java.sql.Connection;
import locadora.Modelos.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import locadora.Modelos.conexao;
/**
 *
 * @author jamelle
 */
public class FilmeDAO{
    
    /*public static Statement stmt;
    public static ResultSet rs;
    public static String deletar, atualizar, inserir, selecionar;*/
    /*public static void inserirFilme(Filme f){
               
                String q = "insert into filme(nome) values('" + f.getNome()+ "')";
        try  //tenta executar um bloco de comandos
        {
            Statement ps = con.createStatement(); 
            ps.executeUpdate(q);
            ps.close(); //fecha o statement
            con.close(); //fecha a conexão
        } 
        catch (SQLException ex) {  }
        
    }*/
    /*public static void deletarFilme(Filme f){
        String q = "delete from filme where nome = '" + f.getNome() + "'";
            try 
           { 
               Statement ps = con.createStatement(); //cria o statement
               ps.executeUpdate(q); //executa o codigo sql
               ps.close(); //fecha o statement
               con.close(); //fecha a conexão
           }
           catch (SQLException ex) { Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex); }
       }
    }*/
    
}
