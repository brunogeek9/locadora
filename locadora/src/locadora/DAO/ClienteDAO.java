/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import locadora.Modelos.Cliente;
import locadora.Modelos.conexao;
/**
 *
 * @author jamelle
 */
/*public class ClienteDAO {
    public static void cadastrarCliente(Cliente cliente){
        Connection con = conexao.main();
        String q = "insert into cliente(nome,cpf_cliente,endereco,telefone,data_nasc,sexo) values('" + cliente.getNome()+ "','" + cliente.getCPF()+ "','" + cliente.getEndereco()+ "','" + cliente.getTelefone()+ "','" + cliente.getData_nasc()+ "','" + cliente.getSexo()+ "')";
        try  //tenta executar um bloco de comandos
        {
            Statement ps = con.createStatement(); 
            ps.executeUpdate(q);
            ps.close(); //fecha o statement
            con.close(); //fecha a conexão
        } 
        catch (SQLException ex) {  }
    }
}*/
