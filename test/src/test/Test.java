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
        
        
        System.out.println(mylist);
    }
    
}
