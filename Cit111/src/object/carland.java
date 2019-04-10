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
public class carland {
    public static void main(String[] args){
        car delorean = new car();
        delorean.year = 1983;
        delorean.makemodel = "Delorean DMC-12";
        displayCarStats(delorean);
        delorean.startEngine();
        delorean.accelerate(88);
        delorean.decelerate(12);
        displayCarStats(delorean);
        delorean.stopEngine();
        displayCarStats(delorean);
        
    }
    public static void displayCarStats(car anycar){
        System.out.println("***** STATS *****");
        System.out.println(anycar.year + " " + anycar.makemodel);
        System.out.println("Engine running? " + anycar.checkengine());
        System.out.println("Current speed is " + anycar.getcurrentspeed());
        System.out.println("******************");
    }
}
