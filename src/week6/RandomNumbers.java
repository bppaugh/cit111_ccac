/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Random;

/**
 *
 * @author brody.paugh
 */
public class RandomNumbers {

    public static void main(String[] args) {
        final int max_quality = 200;
        Random randQual = new Random();
        int unit_num = 1;
        int bestQual = 150;
        int goodqual = 100;
        int okqual = 50;
        int totalbest = 0;
        int totalgood = 0;
        int totalok = 0;
        int totalbad = 0;
        while (unit_num <= 30) {
            int quality = randQual.nextInt(max_quality);
            System.out.println("Unit complete, unit number assigned: " + unit_num);
            unit_num = unit_num + 1;
            System.out.println("unit quality: " + quality);
            if (quality >= bestQual) {
                System.out.println("Best quality produced");
                totalbest = totalbest + 1;
            } else if (quality >= goodqual) {
                System.out.println("Good quality produced");
                totalgood = totalgood + 1;

            } else if (quality >= okqual) {
                System.out.println("ok quality produced");
                totalok = totalok + 1;

            } else {
                System.out.println("Bad quality produced");
                totalbad = totalbad + 1;
            }

        }
        System.out.println("Total units produced at the best quality: " + totalbest);
        System.out.println("Total units produced at good quality: " + totalgood);
        System.out.println("Total units produced at ok quality: " + totalok);
        System.out.println("Total units produced at bad quality: " + totalbad);
        int pass = totalbest + totalgood + totalok;
        double percentpass = (totalbad / (double) pass) * 100;
        System.out.println("percent failure: " + percentpass + "%");
    }

}
