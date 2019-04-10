/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author brody.paugh
 */
public class Donut {
    String name;
    int percRemaining;
    String flavor;
    String topping;
    
    /*
        Simulates eating some percent of this donut
    */
    public void eatDonut (int percEaten){
        percRemaining = percRemaining - percEaten;
    }
    /*
    accessor method for retrieving the value of the percent remaining
    */
    public int getPercRemaining(){
        return percRemaining;
    }




}
