/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.windowmaster;

import java.util.Scanner;

/**
 *
 * @author ggman
 */
public class WindowMaster {
    
    public static void main(String[] args)
    {
        // declarations
        String inHeight;
        String inWidth;
        float height, width;
        float area, perimeter ,cost;
        final float areaCost = (float) 3.50;
        final float trimCost = (float) 2.25;
        
        // scanning values in 
        Scanner in = new Scanner(System.in); 
     
        System.out.println("Please enter a height:");
        inHeight = in.nextLine();
        
        System.out.println("Please enter a width:");
        inWidth = in.nextLine();
        
        // convert
        width = Float.parseFloat(inWidth);
        height = Float.parseFloat(inHeight);
        
        // calculations
        perimeter = 2 * (width + height);
        area = width * height;
        cost = area * areaCost + perimeter * trimCost;
        
        // output
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("The cost is: " + cost);
    }
}
    

    
    
    
   

