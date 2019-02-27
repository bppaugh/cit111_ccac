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
public class Password {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username");
        String baseusername = "admin";
        boolean  login = true;
        while (login) {
            String username = input.next();
            if (username.equals(baseusername)) {
                System.out.println("Hello," + username + " please enter your password");
                String password = input.next();
                String basepassword = "Password";
                if (password.equals(basepassword)) {
                    System.out.println("Welcome");
                    login = false;
                } else {
                    System.out.println("incorrect password, try again");
                }

            } else {
                System.out.println("Username not found, try again");
                
            }
        }
    }

}
