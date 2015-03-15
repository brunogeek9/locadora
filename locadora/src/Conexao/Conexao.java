/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.beans.Statement;
import java.sql.Connection;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.*;

/**
 *
 * @author jamelle
 */
public class Conexao {
    public static Connection main(){
        Connection con;
        Statement stm;
        try{
            Class.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica","root","root");
            return con;
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }
}
