/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class conversions {
    public static double dtoeexchange = 0.888462;
    public static double etodexchange = 1.12554;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        boolean kg = true;
        while (kg) {
            System.out.println("What conversion would you like to do?");
            String con = input.nextLine();
            switch (con) {
                case "Fahrenheit to Celsius":
                    System.out.println("Please enter a Fahrenheit tempature");
                    double ftemp = input.nextInt();
                    double ctemp = FtoC(ftemp);
                    System.out.printf("%.2f is %.2f in Celcius %n", ftemp,ctemp);
                    break;
                case "Celsius to Fahrenheit":
                    CtoF();
                    break;
                case "USD to Euro":
                    DtoE();
                    break;
                case "Euro to USD":
                    EtoD();
                    break;
                case "days to minutes":
                    DaytoMin();
                    break;
                case "hours to minutes":
                    
                    break;
                default:
                    System.out.println("Sorry " + con + " has not been added yet, come back later");
                    break;
            }//end switch
            System.out.println("Do you want to do another calculation?");
            String yorn = input.next();
            if (yorn.equals("no")){
                System.out.println("Happy I could be of service.");
                kg = false;
            }//end if
            else{
                System.out.println("Ready for another calculation");
            }
                
        }//end while
    }//end main

    public static double FtoC( double ftemp) {
        double ctemp = (ftemp - 32) / 1.8;
        return ctemp;
    }//end FtoC
    
    public static void CtoF(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Celcius tempature");
        int ctemp = input.nextInt();
        double ftemp = (ctemp * 1.8 )+32  ;
        System.out.println(ctemp + " is " + ftemp + " in Fahrenheit");
    }// end CtoF
    
    public static void DtoE(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Dollar ammount");
        double dollar = input.nextDouble();
        double euro = dollar * dtoeexchange;
        NumberFormat d = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat e = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Your " + d.format(dollar) + " is equal to " + e.format(euro));
    }//end DtoE
    
    public static void EtoD(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Euro ammount");
        double euro = input.nextDouble();
        double dollar = euro * etodexchange;
        NumberFormat d = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat e = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Your " + e.format(euro) + " is equal to " + d.format(dollar));
    }//end EtoD
    
    public static void DaytoMin(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many day do you want to put into minutes?");
        double days = input.nextDouble();
        
    }//end DaytoMin
    
   
        
    
    
    
}//end class
