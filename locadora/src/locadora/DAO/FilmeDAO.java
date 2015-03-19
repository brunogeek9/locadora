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
    
    public static Statement stmt;
    public static ResultSet rs;
    public static String deletar, atualizar, inserir, selecionar;
    public static void inserirFilme(Filme f){
        
            
                Connection con = conexao.main();
                String q = "insert into filme(nome,duracao) values('" + f.getNome()+ "','" + f.getDuracao()+ "')";
                
                JOptionPane.showMessageDialog(null, "Filme Cadastrado com Sucesso");
            /*} catch (SQLException ex) {
                Logger.getLogger(FilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        
        
    }
    
}
