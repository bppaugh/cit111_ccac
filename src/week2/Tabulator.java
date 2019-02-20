/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package week2;
import java.util.Scanner;
/**
 *
 * @author brody.paugh
 */
public class Tabulator {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int totalRespondents = 0;
        int numLinuxUsers = 0;
        
        System.out.println("LINUX USERS SURVEY");
        
        while(true){
            System.out.println(">>>>>>>>>Question<<<<<<<<<");
            System.out.println("Do you regularly use Linux software? (Android == linux!!");
            System.out.println("Enter 1 for Yes and 0 for NO");
            
            int userResponse = scanner.nextInt();
            
            if(userResponse == 1){
                numLinuxUsers = numLinuxUsers + 1;
                System.out.println("Yeahh! Free software users Unit!");
            }else{
                System.out.println("[sad face] Visit ubuntu.com immediately");
            }
            
            totalRespondents = totalRespondents + 1;
            
            System.out.println("*********SUMMARY*********");
            System.out.println(totalRespondents + "folks have responded.");
            System.out.println(numLinuxUsers + "report(s) regularly using Linux");
            double linuxDouble = (double) numLinuxUsers;
            double totaldouble = (double) totalRespondents;
            double percentUsers = (linuxDouble/totaldouble) * 100;
            System.out.println("this translates into a use of: " + percentUsers + "%");
            
            
            }
        }
    }

