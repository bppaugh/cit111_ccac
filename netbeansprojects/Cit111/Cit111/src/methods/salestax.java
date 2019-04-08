/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;


import java.text.*;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author brody.paugh
 */
public class salestax {

    public static double tax = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keeprunning = true;

        while (keeprunning) {
            System.out.println("Please enter the price.");
            double price = input.nextDouble();
            System.out.println("Please enter the local tax rate percent.");
            tax = input.nextDouble();
            taxcalc(price);
            System.out.println("Do you wish to make another calculation?");
            String go = input.next();
            if (go.equals("yes")) {
                System.out.println("Ready for another calculation.");
            } else {
                System.out.println("Happy I could be of service");
                keeprunning = false;
            }
        }
    }

    public static void taxcalc(double price) {
        double taxpercent = (tax / 100)+1;
        double salestotal = (price * taxpercent);
        double totaltax = salestotal - price;
        NumberFormat t = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("The tax is " + t.format(totaltax) + " making your total price " + t.format(salestotal));
    }
}
