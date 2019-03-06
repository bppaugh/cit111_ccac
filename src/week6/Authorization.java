/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class Authorization {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random security = new Random();
        final int max_code = 99999;
        String username1 = "admin";
        String username2 = "Brody";
        String password1 = "Access";
        String password2 = "Paugh";
        boolean loginuser = true;
        boolean loginpass = true;
        boolean verification = true;
        int attempts = 3;
        while (loginuser) {
            System.out.println("Please enter username");
            String user = input.next();
            if (user.equals(username1)) {
                while (loginpass) {
                    System.out.println("Hello, " + user);
                    System.out.println("Please enter your password");
                    String pass = input.next();
                    if (pass.equals(password1)) {
                        System.out.println("Welcome, " + user);
                        int code = security.nextInt(max_code);
                        System.out.println("Security code: " + code);
                        System.out.println("Please enter security code");
                        int sec_code = input.nextInt();
                        if (sec_code == code) {
                            System.out.println("Verification complete. Whats next?");
                            break;
                        } else {
                            System.out.println("Incorrect verification. you are locked out.");
                            System.exit(0);
                        }

                    } else {
                        System.out.println("Password incorrect, you have " + attempts + " attempts remaining");
                        attempts--;
                        if (attempts == -1) {
                            System.out.println("No attempts remain. You are locked out.");
                            System.exit(0);
                        }
                    }
                }
            }else if(user.equals(username2)){
                while (loginpass){
                    System.out.println("Hello, " + user);
                    System.out.println("Please enter your password");
                    String pass = input.next();
                    if (pass.equals(password2)) {
                        System.out.println("Welcome, " + user);
                        int code = security.nextInt(max_code);
                        System.out.println("Security code: " + code);
                        System.out.println("Please enter security code");
                        int sec_code = input.nextInt();
                        if (sec_code == code) {
                            System.out.println("Verification complete. Whats next?");
                            break;
                        } else {
                            System.out.println("Incorrect verification. you are locked out.");
                            System.exit(0);
                        }

                    } else {
                        System.out.println("Password incorrect, you have " + attempts + " attempts remaining");
                        attempts--;
                        if (attempts == -1) {
                            System.out.println("No attempts remain. You are locked out.");
                            System.exit(0);
                        }
                    }
                   
                }

            }else {
                System.out.println("User not found, try again");
            }

        }
    }

}
