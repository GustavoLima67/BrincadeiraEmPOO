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
    private List<Quart> listQuarts = new ArrayList<>();
    private List<Proprietario> listPro = new ArrayList<>();
    
    public Apartment(){
    }
    public Apartment(String verants,String pincing,List<Quart> listQuarts,List<Proprietario> listPro){
        this.verants = verants;
        this.pincing = pincing;
        this.listQuarts = listQuarts;
        this.listPro = listPro;
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
    private List<Quart> getListQuarts(){
        return listQuarts;
    }
    private void addListPro(Proprietario listProp){
        listPro.add(listProp);
    }
    
}
