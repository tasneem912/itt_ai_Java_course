/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author dell
 */
public class pyramid {

    String Pharaoh;
    String Ancient_name;
    String Modern_name;	
    int Dynasty;
    String Site;	
    float Base1;
    float Base2; 
    float Height; 
    float Slope; 
    float Volume;
    float Latitude;
    float Longitude;
    String Type;
    String Lepsius;
    String Material;

    public pyramid(String Pharaoh, String Ancient_name, String Modern_name, int Dynasty, String Site, float Base1, float Base2, float Height, float Slope, float Volume, float Latitude, float Longitude, String Type, String Lepsius, String Material) {
        this.Pharaoh = Pharaoh;
        this.Ancient_name = Ancient_name;
        this.Modern_name = Modern_name;
        this.Dynasty = Dynasty;
        this.Site = Site;
        this.Base1 = Base1;
        this.Base2 = Base2;
        this.Height = Height;
        this.Slope = Slope;
        this.Volume = Volume;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Type = Type;
        this.Lepsius = Lepsius;
        this.Material = Material;
    }

    @Override
    public String toString() {
        return "pyramid{" + "Pharaoh=" + Pharaoh + ", Ancient_name=" + Ancient_name + ", Modern_name=" + Modern_name + ", Dynasty=" + Dynasty + ", Site=" + Site + ", Base1=" + Base1 + ", Base2=" + Base2 + ", Height=" + Height + ", Slope=" + Slope + ", Volume=" + Volume + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Type=" + Type + ", Lepsius=" + Lepsius + ", Material=" + Material + '}';
    }
   

    
}
