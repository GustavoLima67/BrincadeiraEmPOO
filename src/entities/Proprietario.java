/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gustavo
 */
public class Proprietario {
    private String name;
    private Integer age;
    private Double fayxeSalary;
    
    public Proprietario(){
    }
    public Proprietario(String name,Integer age,Double fayxeSalary){
        this.name = name;
        this.age = age;
        this.fayxeSalary = fayxeSalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public Double getFayxeSalary(){
        return fayxeSalary;
    }
    public void setFayxeSalary(Double fayxeSalary){
        this.fayxeSalary = fayxeSalary;
    }
    
    
}
