/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class switchmethods {
    public static boolean moron = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("hello, choose an option");
        
        
        while (moron) {
            System.out.println("1: I want a special statement");
        System.out.println("2: I want a small number");
        System.out.println("3: I want a big number");
        System.out.println("4: I dont want anything");
        int userint = input.nextInt();

            switch (userint) {
                case 1:
                    outcome1();
                    break;
                case 2:
                    outcome2();
                    break;
                case 3:
                    outcome3();
                    break;
                case 4:
                    outcome4();
                    break;
                default:
                    System.out.println("I gave you options moron, try again");
            }

        }
    }
    public static void outcome1(){
        System.out.println("You chose a special statement");
        System.out.println("Your statement is: none");
        System.out.println("Yep, jokes on you theres no special statement");
        moron = false;
    }
    public static void outcome2(){
        Random r = new Random();
        final int max = 100;
        int rand = r.nextInt(max);
        System.out.println("You chose a small number");
        System.out.println("Your small number is: " + rand);
        moron = false;
    }
    public static void outcome3(){
        Random r = new Random();
        BigInteger big = new BigInteger(200, r);
        System.out.println("You chose a big number");
        System.out.println("Your big number is: " +big);
        moron = false;
    }
    public static void outcome4(){
        System.out.println("You chose I dont want anything");
        System.out.println("why are you here then? go home the programs over");
        moron = false;
    }
}
