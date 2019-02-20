/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author brody.paugh
 */
public class Testvariables {
    
    public static void main(String[] args){
        int fps = 20;
        int strat = 5;
        int survive = 14;
        int misc = 26;
        int totalGames;
        int action;
        int thinking;
        
        totalGames = fps + strat + survive + misc;
        action = fps + survive;
        thinking = strat + survive;
        
        System.out.println("Total amount of games: " + totalGames);
        System.out.println("Total action games: " + action);
        System.out.println("Total thinking games: " + thinking);
    }
    
}
