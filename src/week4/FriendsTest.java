/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class FriendsTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        System.out.println("Hello, please answer 1 for yes and 2 for no.");
        System.out.println("Do you enjoy gaming?");
        int gaming = input.nextInt();

        if (gaming == 1) {
            score = score + 2;
            System.out.println("Are you PC or Console?");
            System.out.println("1 for PC, 2 for console");
            int pc = input.nextInt();
            if (pc == 1) {
                System.out.println("PC master race!");
                score = score + 1;
            } else {
                System.out.println("Console pesant");
                score = score - 1;
            }
        }
        System.out.println("Do you like football?");
        int football = input.nextInt();
        if (football == 1) {
            score = score + 1;
            System.out.println("Whos your favorite team?");
            System.out.println("1 for Steelers, 2 for patriots, 3 for Other");
            int team = input.nextInt();
            if (team == 1){
                score = score + 2;
                System.out.println("HERE WE GO!");
            }else if (team == 2){
                System.out.println("Yeahhhh.... this isn't going to work.");
                System.exit(0);
                
            }else{
                System.out.println("ok we can get along.");
            }
        }
        System.out.println("How about cars?");
        int cars = input.nextInt();
        if (cars == 1){
            score = score + 1;
            System.out.println("Lets talk sometime.");
        }
        System.out.println("Your score was " + score);
        if (score >= 3){
            System.out.println("Maybe we could be friends.");
        }else{
            System.out.println("I dont think we can be friends.");
        }

    }

}