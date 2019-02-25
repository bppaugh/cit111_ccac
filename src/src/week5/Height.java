/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class Height {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int success = 0;
        final int minimum = 137;
        while (true) {
            System.out.println("The minimum height is 137 cm");
            System.out.println("Please enter your height:");
            int rider = input.nextInt();
            if (rider >= minimum) {
                System.out.println("Please board");
                success = success + 1;

            } else {
                System.out.println("Sorry you cannot board");
            }

            total = total + 1;
            double totaldouble = (double) total;
            double successdouble = (double) success;
            double boardsuccess = (successdouble / totaldouble) * 100;
            System.out.println("Successful boarding percentage: " + boardsuccess + "%");
        }
    }

}
