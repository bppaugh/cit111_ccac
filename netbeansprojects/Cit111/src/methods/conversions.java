/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class conversions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        boolean kg = true;
        while (kg) {
            System.out.println("What conversion would you like to do?");
            String con = input.nextLine();
            switch (con) {
                case "Fahrenheit to Celscius":
                    FtoC();
                case "Celscius to Fahrenheit":
                    CtoF();

                case "USD to Euro":
                    DtoE();
                case "Euro to USD":
                    EtoD();
                default:
                    System.out.println("Sorry " + con + " has not been added yet, come back later");

            }
        }
    }

    public static void FtoC() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Fehrenheit tempature");
        int ftemp = input.nextInt();
        int ctemp = (ftemp - 32) * (5 / 9);
        System.out.println(ftemp + " is " + ctemp + " in celcius");
    }
}
