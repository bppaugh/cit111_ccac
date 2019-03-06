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
public class Loops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numLoops = 0;
        System.out.println("How many loops will you want to run?");
        int userloops = input.nextInt();
        
        while(numLoops < userloops){
            System.out.println("The value of numloops is: " + numLoops);
            numLoops = numLoops + 1;
            
        }
        System.out.println("outside of loop");
    }
    
}
