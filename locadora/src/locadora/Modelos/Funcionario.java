/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.Modelos;

/**
 *
 * @author jamelle
 */
public class Funcionario {
    private String cpf;
    private String nome;
    private String fone;
    private String endereco;
    public Funcionario(){
        
    }
    public Funcionario(String CPF,String Nome,String Fone,String Endereco){
        this.cpf = CPF;
        this.endereco = Endereco;
        this.fone = Fone;
        this.nome = Nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String CPF){
        this.cpf = CPF;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
    public String getFone(){
        return fone;
    }
    public void setFone(String Fone){
        this.fone = Fone;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String Endereco){
        this.endereco = Endereco;
    }
}
