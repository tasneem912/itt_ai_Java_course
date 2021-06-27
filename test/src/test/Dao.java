/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Dao {
     public List <pyramid> get_data_from_file(String path) {
         List <pyramid> mylist = new ArrayList<>() ;
     File file = new File(path);
     Scanner scan;
     
         try {
             scan = new Scanner(file);
             scan.nextLine();
             while (scan.hasNext()){
        
             String line = scan.nextLine();
             String[] arr = line.split(",", -1);
                    String Pharaoh = arr[0];
                    String Ancient_name = arr[1];
                    String Modern_name = arr[2];
                    int Dynasty ;
                    if (arr[3].isBlank()){
                        Dynasty = 0;
                    }
                    else {
                    Dynasty = Integer.valueOf(arr[3]);
                    }
                    
                    
                    String Site= arr[4];	
                    float Base1 ;
                    if (arr[5].isBlank()){
                        Base1 = 0;
                    }
                    else {
                    Base1 = Float.valueOf(arr[5]);
                    }
                    
                    float Base2 ;
                    if (arr[6].isBlank()){
                        Base2 = 0;
                    }
                    else {
                    Base2 = Float.valueOf(arr[6]);
                    }
                    
                    float Height ;
                    if (arr[7].isBlank()){
                        Height = 0;
                    }
                    else {
                    Height = Float.valueOf(arr[7]);
                    }
                    
                    
                    float Slope ;
                    if (arr[8].isBlank()){
                        Slope = 0;
                    }
                    else {
                    Slope = Float.valueOf(arr[8]);
                    }
                    
                    
                    float Volume ;
                    if (arr[9].isBlank()){
                        Volume = 0;
                    }
                    else {
                    Volume = Float.valueOf(arr[9].replace(".", ""));
                    }
                    
                    
                    float Latitude ;
                    if (arr[10].isBlank()){
                        Latitude = 0;
                    }
                    else {
                    Latitude = Float.valueOf(arr[10]);
                    }
                    
                    float Longitude ;
                    if (arr[11].isBlank()){
                        Longitude = 0;
                    }
                    else {
                    Longitude = Float.valueOf(arr[11]);
                    }
                    String Type  = arr[12];
                    String Lepsius = arr[13];
                    String Material = arr[14];
                    pyramid p = new pyramid(Pharaoh, Ancient_name, Modern_name,  Dynasty,Site,  Base1,  Base2, Height, Slope, Volume,Latitude,Longitude,Type,Lepsius,Material);
             //System.out.println(p);
             mylist.add(p);
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
                 
         }
     
     
     return mylist;
 }
         
}
