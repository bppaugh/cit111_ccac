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
public class call {
    public String Team;
    public String Center;
    public String LGuard;
    public String RGuard;
    public String LTackle;
    public String RTackle;
    public String ranking;

    public static void main(String[] args) throws FileNotFoundException{
      String file = "c:\\Users\\brody.paugh\\documents\\oline-lineup.csv";
      BufferedReader br = null;
      String line = "";
      String cvsSplitBy = ",";
      
      try{
          
          br = new BufferedReader(new FileReader(file));
          while ((line = br.readLine()) !=null){
              
              String[] lineup = line.split(cvsSplitBy);
              ArrayList list = new ArrayList();
              list.add(lineup[0]);
              list.add(lineup[1]);
              list.add(lineup[2]);
              list.add(lineup[3]);
              list.add(lineup[4]);
              list.add(lineup[5]);
              list.add(lineup[6]);
              
          
      }
      }catch (FileNotFoundException e){
          e.printStackTrace();
      }catch (IOException e){
          e.printStackTrace();
      }finally{
          if (br !=null){
              try{
                  br.close();
              }catch (IOException e){
                  e.printStackTrace();
              }
          }
      }
      
      
       

        
    }
}
