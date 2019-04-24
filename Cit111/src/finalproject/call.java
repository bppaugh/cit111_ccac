/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author brody.paugh
 */
public class call {
    public String Team;
    public String Center;
    public String LGuard;
    public String RGuard;
    public String LTackle;
    public String RTackle;
    public String ranking;

    public static void main(String[] args) throws FileNotFoundException{
        java.io.File file = new java.io.File("c:\\Users\\brody.paugh\\documents\\oline-lineup.csv");
        
        Scanner input = new Scanner(file);
        
        while(input.hasNext()){
            String Team = input.next();
            String Center = input.next();
            String LGuard = input.next();
            String RGuard = input.next();
            String LTackle = input.next();
            String RTackle = input.next();
            String ranking = input.next();
            System.out.println(
            Team + " " + LTackle + " " + LGuard + " " + Center + " " + RGuard
            + " " + RGuard + " " + RTackle + " " + ranking);
        }
        
        input.close();
    }
}
