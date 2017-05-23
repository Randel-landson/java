/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TbHeori;

/**
 *
 * @author Landson
 */
public class Heroi {
    private int cod;
    private String nome;
    private String pode;

    public Heroi(){
    }
    public Heroi(int id , String nome , String p){
     this.setCod(cod);
     this.setNome(nome);
     this.setPode(pode);
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPode() {
        return pode;
    }

    public void setPode(String pode) {
        this.pode = pode;
    }
    
    
}
