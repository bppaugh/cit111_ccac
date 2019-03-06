/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class Gas {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many gallons of gas do you have left?");
        double gas = input.nextDouble();
        System.out.println("How many miles until the next gas station?");
        double miles = input.nextDouble();
        double MPG = gas*28;
        
        if (MPG>=miles){
            System.out.println("You should be good");
        } else{
            System.out.println("You're going to have a nice walk, hope its a nice day.");
        }
       
    }
    
}
