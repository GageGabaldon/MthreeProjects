/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.ui;

import java.util.Scanner;

/**
 *
 * @author ggman
 */
public class UserIOConsoleImpl implements UserIO {
    Scanner in = new Scanner(System.in);
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public double readDouble(String prompt) {
        this.print(prompt);
        while(true) {
            try{
                return Double.parseDouble(in.nextLine());
                
            }catch(NumberFormatException e) {
                this.print("Needs to be Double.");
            }
        }
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double result;
        do {
            result = this.readDouble(prompt);
            
        }while(result < min || result > max);
        return result;
    }

    @Override
    public float readFloat(String prompt) {
        this.print(prompt);
        while(true) {
            try{
                return Float.parseFloat(in.nextLine());
                
            }catch(NumberFormatException e) {
                this.print("Needs to be Float");
            }
        }    
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            result = this.readFloat(prompt);
            
        }while(result < min || result > max);
        return result;
    }

    @Override
    public int readInt(String prompt) {
        this.print(prompt);
        while(true) {
            try{
                return Integer.parseInt(in.nextLine());
                
            }catch(NumberFormatException e) {
                this.print("Needs to be Integer");
            }
        }
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            result = this.readInt(prompt);
            
        }while(result < min || result > max);
        return result;
    }

    @Override
    public long readLong(String prompt) {
        this.print(prompt);
        while(true) {
            try{
                return Long.parseLong(in.nextLine());
                
            }catch(NumberFormatException e) {
                this.print("Needs to be Long.");
            }
        }    
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            result = this.readLong(prompt);
            
        }while(result < min || result > max);
        return result;      
    }

    @Override
    public String readString(String prompt) {
        this.print(prompt);
        return in.nextLine();
    }
    
}
