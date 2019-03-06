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
public class MathQuiz {
    
    public static void main(String[] args){
        Scanner answer = new Scanner(System.in);
        int q1 = 9*9;
        int q2 = (100/25) *2;
        int q3 = (4*4)*4+2;
        System.out.println("Math Quiz");
        boolean correct1 = true;
        boolean correct2 = true;
        boolean correct3 = true;
        int attempts = 0;
        int correctattempts = 0;
        System.out.println(q3);
        while (correct1){
            System.out.println("Question 1: 9*9");
            int a1 = answer.nextInt();
            if (a1 == q1){
                System.out.println("correct");
                System.out.println("*******");
                correct1 = false;
                attempts++;
                correctattempts++;
            }else{
                System.out.println("Incorrect");
                System.out.println("********");
                attempts++;
            }
            
        }
        while (correct2){
            System.out.println("Question 2: (100/25)*2");
            int a2 = answer.nextInt();
            if (a2 == q2){
                System.out.println("correct");
                System.out.println("*******");
                correct2 = false;
                attempts++;
                correctattempts++;
            }else{
                System.out.println("Incorrect");
                System.out.println("*********");
                attempts++;
            }
        }
        while (correct3){
            System.out.println("Question 3: (4*4)*4+2");
            int a3 = answer.nextInt();
            if (a3 == q3){
                System.out.println("correct");
                System.out.println("*******");
                correct3 = false;
                attempts++;
                correctattempts++;
            }else{
                System.out.println("Incorrect");
                System.out.println("*********");
                attempts++;
            }
        }
        System.out.println("Score: " + correctattempts + "/" + attempts);
        if (attempts >= 6){
            System.out.println("You failed");
        }else {
            System.out.println("You passed");
        }
    }
    
}
