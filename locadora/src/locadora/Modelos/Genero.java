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
public class Genero {
    private int idGenero;
    private String nome;
    public Genero(){
    
    }
    public Genero(int idgenero,String Nome){
        this.idGenero = idgenero;
        this.nome = Nome;
    }
    public int getIdGenero(){
        return idGenero;
    }
    public void setIdGenero(int IdGenero){
        this.idGenero = IdGenero;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
}
