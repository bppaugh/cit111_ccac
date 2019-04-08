/*
 * Still working out math bugs, may give several infinity answers
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author brody.paugh
 */
public class Fundimentalsproject {
    public static int turn = 0;
    public static int speed = 0;
    public static int distance = 0;
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        boolean race = true;
        while (race){
            System.out.println("What is the degree of the turn?");
            turn = input.nextInt();
            System.out.println("Whats your current speed?");
            speed = input.nextInt();
            System.out.println("Enter distance, in feet, from turn.");
            distance = input.nextInt();
            double decel = breakcalc();
            print(decel);
        }//end while
        
        
    }//end main
    
    public static double breakcalc(){
        double maxspeed = speed/2 +5;
        double time = distance/speed;
        double decel = (maxspeed - speed)/time;
        System.out.println(maxspeed);
        System.out.println(time);
        System.out.println(decel);

        return decel;
        
    }
    
    public static void print(double decel){
        
        if (decel < -7){
            System.out.println(Fundimentalsproject.BLACK_BOLD + "Too late, over steer, you're losing time");
        }else if (decel < -5.5){
            System.out.println(Fundimentalsproject.RED_BOLD + "BREAK HARD NOW!!!");
        }else if (decel < -3){
            System.out.println(Fundimentalsproject.YELLOW_BOLD + "Break at a medium pace");
        }else if (decel <0){
            System.out.println(Fundimentalsproject.GREEN_BOLD + "Slightly Break");
        }else{
            System.out.println(Fundimentalsproject.BLUE_BOLD + "Just coast it out");
        }
        System.out.println("NO MATTER WHAT HIT THE APEX");
        
    }
}
