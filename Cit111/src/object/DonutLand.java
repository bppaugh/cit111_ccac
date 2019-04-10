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
public class DonutLand {

    //make (i.e. "instantiate") a Donut
    //and store a reference to that object
    //in variable called firstDonut
    // of type donut
    public static void main(String[] args) {
        Donut firstDonut = new Donut();
        firstDonut.topping = "Chocolate";
        firstDonut.name = "Starving";
        firstDonut.flavor = "vanilla";
        firstDonut.percRemaining = 100;
        firstDonut.eatDonut(99);
  
        Donut secondDonut = new Donut();
        secondDonut.topping = "Chocolate";
        secondDonut.name = "Hungry";
        secondDonut.percRemaining = 100;
        secondDonut.flavor = "vanilla";
        secondDonut.eatDonut(0);
        printDonutStats(firstDonut);
        printDonutStats(secondDonut);
    }
    public static void printDonutStats(Donut food){
        System.out.println("Percent remaining of " + food.name + " is " 
                + food.getPercRemaining() + "%");
        
    }

}
