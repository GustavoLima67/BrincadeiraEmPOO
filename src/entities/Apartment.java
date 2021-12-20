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
    private Integer balcony;
    private List<Fourth> listFourth = new ArrayList<>();
    private List<Owner> listOwner = new ArrayList<>();
    
    public Apartment(){
    }
    public Apartment(Integer balcony,List<Fourth> listFourth,List<Owner> listOwner){
        this.balcony = balcony;
        this.listFourth = listFourth;
        this.listOwner = listOwner;
    }
    public Apartment(Integer balcony){
        this.balcony = balcony ;
    }
    public Integer getBalcony(){
        return balcony;
    }
    public void setBalcony(Integer balcony){
        this.balcony = balcony;
    }
    private List<Fourth> getListFourth(){
        return listFourth;
    }
    private void addListPro(Owner listOwne){
        listOwner.add(listOwne);
    }
    @Override
    public String toString(){
        return "Balcony: "+balcony;
    }
}
