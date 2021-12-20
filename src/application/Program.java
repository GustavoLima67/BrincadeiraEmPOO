/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Owner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Owner> list = new ArrayList<>();
        
        System.out.print("Enter number of owner: ");
        int numberOwner = sc.nextInt();
        
        for(int i=1;i<=numberOwner;i++){
            System.out.println("Owner #"+i+":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary range: ");
            double salaryRange = sc.nextDouble();
            Owner on = new Owner(name, age, salaryRange);
            list.add(on);
        }
        System.out.print("Enter with number the fourth: ");
        int withFourth = sc.nextInt();
        for(int i=1;i<=withFourth;i++){
            System.out.println("Fourth #"+i+":");
            System.out.print("Number the fourth: ");
            int numberFourth = sc.nextInt();
            System.out.print("room with balcony or without? (c/s)");
            char balconyRoom = sc.next().charAt(0);
            
            if(balconyRoom == 'c'){
                System.out.print("how many balconies: ");
                int balcony = sc.nextInt();
                 
            }else{
                break;
            }
        }
        System.out.println();
        System.out.println("Apartment:");
        for(Owner on : list){
            System.out.println(on);
        }
    
    }
}
