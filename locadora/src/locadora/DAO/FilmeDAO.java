/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.DAO;

import Conexao.ConectaDB;
import locadora.Modelos.Filme;
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
public class FilmeDAO extends ConectaDB{
    public static Statement stmt;
    public static ResultSet rs;
    public static String deletar, atualizar, inserir, selecionar;
    public static void inserirFilme(Filme f){
        getConexaoDB();
        if(conn != null){
            //Variável contendo o código sql para inserção
            inserir = "insert into filme(nome,duracao) values('" + f.getNome()+ "','" + f.getDuracao()+ "')";
            try {
                stmt = conn.createStatement();
                stmt.executeUpdate(inserir);
                JOptionPane.showMessageDialog(null, "Filme Cadastrado");
            } catch (SQLException ex) {
                Logger.getLogger(FilmeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
