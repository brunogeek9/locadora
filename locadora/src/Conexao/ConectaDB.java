/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jamelle
 */
public class ConectaDB {
    public static Connection conn = null; 
    public static String status = "Não Conectou!";
    public ConectaDB(){
    
    }
    public static java.sql.Connection getConexaoDB(){
            //Se a conexão não estiver iniciada
            if(conn == null){
                try{
                    //Carregando o JDBC Driver padrão
                    String driverName = "com.mysql.jdbc.Driver";
                    Class.forName(driverName);
                    //Configuração da Conexão com o Banco de Dados
                    String serverName = "localhost:3306/"; //caminho do servido do BD
                    String myDB = "locadora";//Nome do banco
                    String url = "jdbc:mysql://" + serverName + myDB;
                    String username = "root";//usuário
                    String password = "root";//senha
                    conn = DriverManager.getConnection(url, username, password);
                } catch(ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null, "Conexão não inciada");
                }
            }
            //se já estiver, retorna apenas a conexão
                return conn;
        }
}

