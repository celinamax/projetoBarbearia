
package model;
public class Servico {    
    private int id;
    private String descricao;
    private Double valor;
    
    public Servico(int id, String descricao, Double valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public Double getValor(){
        return valor;
    }   
    
    public void setValor(Double valor){
        this.valor = valor;
    }

        
}
