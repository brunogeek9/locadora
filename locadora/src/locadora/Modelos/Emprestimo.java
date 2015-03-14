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
public class Emprestimo {
    private int idEmprestimo;
    private String data_dev;
    private String data_emp;
    private String data_pre;
    public Emprestimo(int idEmprestimo,String data_dev,String data_emp,String data_pre){
        this.idEmprestimo = idEmprestimo;
        this.data_dev = data_dev;
        this.data_emp = data_emp;
        this.data_pre = data_pre;
    }
    public Emprestimo(){
    
    }
    public int getIdEmprestimo(){
        return this.idEmprestimo;
    }
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }
    
    public String getDataDev(){
        return data_dev;
    }
    public void setDataDev(String data_dev){
        this.data_dev = data_dev;
    }
    
    public String getDataEmp(){
        return data_emp;
    }
    public void setDataemp(String data_emp){
        this.data_emp = data_emp;
    }
    
    public String getDataPre(){
        return data_pre;
    }
    public void setDataPre(String data_pre){
        this.data_pre = data_pre;
    }
}
