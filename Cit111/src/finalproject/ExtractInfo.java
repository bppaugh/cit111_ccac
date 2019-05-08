/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author brody.paugh
 */
public class ExtractInfo {

    public String Team;
    public String Center;
    public String LGuard;
    public String RGuard;
    public String LTackle;
    public String RTackle;
    public String ranking;
    public String[] lineup;
    
    public ExtractInfo(){
        lineup = new String[7];
    
}
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("this is stupid");

    }//end main
    
    public void reading(){
        String file = "c:\\Users\\brody.paugh\\documents\\oline-lineup.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> list = new ArrayList<String>();
         try {

            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {

                lineup = line.split(cvsSplitBy);
                System.out.println(lineup[0] +" " + lineup[1] +" "+lineup[2]+" "
                        + lineup[3] + " " + lineup[4] + " " + lineup[5] + " " + 
                        lineup[6]);
                
                

                
            } //end while     

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}//end class
