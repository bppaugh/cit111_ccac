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
        boolean login = true;
        int tries = 3;
        while (login) {
            String username = input.next();
            if (username.equals(baseusername)) {
                System.out.println("Hello," + username + ", Please enter your password");
                String basepassword = "Password";
                while (true) {
                    String password = input.next();
                    if (password.equals(basepassword)) {
                        System.out.println("Welcome");
                        login = false;
                    } else {
                        System.out.println("Incorrect password, try again");
                        System.out.println("You have " + tries + " tries remaining");
                        tries = tries - 1;
                    }
                   if (tries == -1){
                       System.out.println("Login failed, you are locked out.");
                       System.exit(0);
                   }
                }
            } else {
                System.out.println("Username not found, try again");

            }
        }
    }

}
