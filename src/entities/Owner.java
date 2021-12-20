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
public class Owner {
    private String name;
    private Integer age;
    private Double salaryRange;
    
    public Owner(){
    }
    public Owner(String name,Integer age,Double salaryRange){
        this.name = name;
        this.age = age;
        this.salaryRange = salaryRange;
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
        return salaryRange;
    }
    public void setFayxeSalary(Double fayxeSalary){
        this.salaryRange = fayxeSalary;
    }
    @Override
    public String toString(){
        return "Name: "+name+", Age: "+age+", Salary range: "+String.format("%.2f%n ",salaryRange);
    }
    
}
