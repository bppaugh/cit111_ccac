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
public class MathQuiz {

    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        Random question = new Random();
        int q1 = 9 * 9;
        System.out.println("Math Quiz");
        boolean correct1 = true;
        boolean correct2a = true;
        boolean correct2b = true;
        boolean correct3 = true;
        int attempts = 0;
        int correctattempts = 0;
        while (correct1) {
            System.out.println("Question 1: 9*9");
            int a1 = answer.nextInt();
            if (a1 == q1) {
                System.out.println("correct");
                System.out.println("*******");
                correct1 = false;
                attempts++;
                correctattempts++;
            } else {
                System.out.println("Incorrect");
                System.out.println("********");
                attempts++;
            }

        }
        if (attempts <= 2) {
            final int q2amax = 20;
            int p1 = question.nextInt(q2amax);
            int p2 = question.nextInt(q2amax);

            while (correct2a) {

                System.out.println("Question 2: " + p1 + " x " + p2);
                int a2 = answer.nextInt();
                if (a2 == p1*p2) {
                    System.out.println("correct");
                    System.out.println("*******");
                    correct2a = false;
                    attempts++;
                    correctattempts++;
                } else {
                    System.out.println("Incorrect");
                    System.out.println("*********");
                    attempts++;
                }
            }
        } else{
            final int q2bmax = 10;
            int p3 = question.nextInt(q2bmax);
            int p4 = question.nextInt(q2bmax);
            int ra = p3*p4;
            while (correct2b){
                System.out.println("Question 2: " + p3 + " x " + p3);
                int a3 = answer.nextInt();
                if (a3 == ra) {
                    System.out.println("correct");
                    System.out.println("*******");
                    correct2b = false;
                    attempts++;
                    correctattempts++;
                } else {
                    System.out.println("Incorrect");
                    System.out.println("*********");
                    attempts++;
                }
                
            }
            
            
        }

        System.out.println("Score: " + correctattempts + "/" + attempts);
        if (attempts >= 6) {
            System.out.println("You failed");
        } else {
            System.out.println("You passed");
        }
    }
    public static int getRandomInt(int 10, int 20){
    
        
    
}

}


