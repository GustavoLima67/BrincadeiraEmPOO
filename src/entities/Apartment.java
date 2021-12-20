/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Apartment {
    private String verants;
    private String pincing;
    private List<Fourth> listFourth = new ArrayList<>();
    private List<Owner> listOwner = new ArrayList<>();
    
    public Apartment(){
    }
    public Apartment(String verants,String pincing,List<Fourth> listFourth,List<Owner> listOwner){
        this.verants = verants;
        this.pincing = pincing;
        this.listFourth = listFourth;
        this.listOwner = listOwner;
    }
    public String getVerants(){
        return verants;
    }
    public String getPincing(){
        return pincing;
    }
    public void setPincing(String pincing){
        this.pincing = pincing;
    }
    private List<Fourth> getListFourth(){
        return listFourth;
    }
    private void addListPro(Owner listOwne){
        listOwner.add(listOwne);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Verants: ").append(verants);
        sb.append("Pincing: ").append(pincing);
        return sb.toString();
    }
}
