/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;

/**
 *
 * @author dell
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dao d = new Dao();
        List<pyramid> mylist = d.get_data_from_file("C:\\Users\\dell\\Documents\\NetBeansProjects\\test\\src\\test\\pyramids.csv");
        
        float median = mylist.stream().map((t) -> {
            return t.Height; //To change body of generated lambdas, choose Tools | Templates.
        }).sorted().toList().get((int)(mylist.size()/2));
        
        System.out.println("median applied on the Height column = " + median);
        
        
        
        int firstquad = mylist.stream().map((t) -> {
            return t.Dynasty; //To change body of generated lambdas, choose Tools | Templates.
        }).sorted().toList().get((int)(mylist.size()/4));
        System.out.println("1st quad applied on the Dynasty column = " + firstquad );
        
        float thirdquad = mylist.stream().map((t) -> {
            return t.Base1; //To change body of generated lambdas, choose Tools | Templates.
        }).sorted().toList().get((int)(mylist.size()*3/4));
        
        System.out.println("3rd quad applied on the Base1 column = " + thirdquad);
        
        
        
        
        
        
    }
    
}
