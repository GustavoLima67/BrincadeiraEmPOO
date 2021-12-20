/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Quart extends Apartment{
    private String quart;
    
    public Quart(){
        super();
    }
    public Quart(String verants,String pincing,String quart,List<Quart> listQuarts,List<Proprietario> listPro){
        super(verants,pincing,listQuarts,listPro);
        this.quart = quart;
    }
    public String getQuart(){
        return quart;
    }
    public void setQuart(String quart){
        this.quart = quart;
    }
}
