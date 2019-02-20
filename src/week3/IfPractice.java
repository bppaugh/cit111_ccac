/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week3;

import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class IfPractice {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        int i = inputReader.nextInt();
        int c = inputReader.nextInt();
        boolean check = i > c;
        if (check){
            System.out.println("TRUE! "  + i + " is greater than " + c);
        } else {
            System.out.println("False!"  + i + " is less than" + c);
        }
    }
}
