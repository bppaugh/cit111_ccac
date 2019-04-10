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
public class car {
    public int year;
    public String makemodel;
    private boolean enginerunning;
    private double speed;
    
    public void startEngine(){
        enginerunning = true;
        System.out.println("Its fired up");
    }
    public void stopEngine(){
        enginerunning = false;
        System.out.println("Its off");
    }
    public boolean checkengine(){
        return enginerunning;
    }
    public double getcurrentspeed(){
        return speed;
    }
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
    }
    
}
