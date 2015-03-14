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
public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String data_nasc;
    private char sexo;
    
    public Cliente(String cpf,String nome,String endereco,String telefone,String data_nasc,char sexo ){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
    }
    public Cliente(){
    
    }
    public String getCPF(){
        return cpf;
    }
    public void setCPF(String CPF){
        this.cpf = CPF;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String Endereco){
        this.endereco = Endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String Telefone){
        this.telefone = Telefone;
    }
    public String getData_nasc(){
        return this.data_nasc;
    }
    public void setData_nasc(String Data_nasc){
        this.data_nasc = Data_nasc;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char Sexo){
        this.sexo = Sexo;
    }
}
