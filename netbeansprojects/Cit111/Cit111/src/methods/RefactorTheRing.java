/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Random;

/**
 *
 * @author brody.paugh
 */
public class RefactorTheRing {

    public static String[] viewer = new String[5];
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static final String BLUE = "\033[0;34m";    // BLUE

    public static void main(String[] args) {
        viewer[0] = "Katie";
        viewer[1] = "Josh";
        viewer[2] = "Rachel";
        viewer[3] = "Noah";
        viewer[4] = "Aiden";
        for (String array : viewer) {

            System.out.println(array + " watched the tape; 7 days to live");
        }//end for
        cpyornot(viewer);

    }//end main

    public static void cpyornot(String[] person) {
        Random watch = new Random();
        for (String array : viewer) {
            boolean madeCopy = watch.nextBoolean();
            if (madeCopy) {
                System.out.println(RefactorTheRing.BLUE + array + " made a copy, they'll live");
            } else {
                System.out.println(RefactorTheRing.RED + array + " didnt make a copy, they're dead");
            }
        }

    }
}
