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
public class Filme {
    private int idFilme;
    private String nome;
    private String duracao;
    public Filme(){
    
    }

    /**
     *
     * @param Nome
     */
    public Filme(String Nome,String Duracao){
        //this.duracao = Duracao;
        this.nome = Nome;
        this.duracao = Duracao;
    }
    public int getIdFilme(){
        return idFilme;
    }
    public void getIdFilme(int idfilme){
        this.idFilme = idfilme;
    }
    public String getDuracao(){
        return duracao;
    }
    public void setDuracao(String Duracao){
        this.duracao = Duracao;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
}
