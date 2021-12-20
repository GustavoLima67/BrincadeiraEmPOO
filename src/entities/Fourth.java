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
public class Fourth extends Apartment{
    private String quart;
    
    public Fourth(){
        super();
    }
    public Fourth(String verants,String pincing,List<Fourth> listFourth,List<Owner> listOwner,String quart){
        super(verants, pincing, listFourth, listOwner);
        this.quart = quart;
    }
    public String getQuart(){
        return quart;
    }
    public void setQuart(String quart){
        this.quart = quart;
    }
    @Override
    public String toString(){
        return "Quart: "+quart;
    }
}
