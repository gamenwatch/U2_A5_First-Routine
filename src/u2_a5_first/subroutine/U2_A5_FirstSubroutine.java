/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a5_first.subroutine;

import java.util.Scanner;


/**
 * Jacob Lacey
 * Practice making your own methods
 */
public class U2_A5_FirstSubroutine {

    /**
     * @param args the command line arguments
     */
    
    //ADITIONAL METHODS
    public static void forceOneOut() {
        Scanner keyedInput = new Scanner(System.in);
        
        //mass
        System.out.println("What is your mass?");
        double mass;
        mass = keyedInput.nextInt();
        
        //acceleration
        System.out.println("What is your acceleration?");
        double acceleration;
        acceleration = keyedInput.nextInt();
        
        //Force
        double force;
        force = mass * acceleration; 
        System.out.println("Your Force is: "+force+"N");
}
    
    public static void forceTwoOut() {
        Scanner keyedInput = new Scanner(System.in);
        
        //mass
        System.out.println("What is your mass?");
        double mass;
        mass = keyedInput.nextInt();
        
        //acceleration
        System.out.println("What is your acceleration?");
        double acceleration;
        acceleration = keyedInput.nextInt();
        
        //Force
        double force;
        force = mass * acceleration; 
        System.out.println("Your Force is: "+force+"N");
}
    
//////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args) {
        //Variables
        Scanner keyedInput = new Scanner(System.in);
        int calculationChoice;
        
        // Introduction
        System.out.println("-------------------------------------");
        System.out.println("Welcome to the Forces Calculator Lite");
        System.out.println("-------------------------------------");
        System.out.println("What calculation would you like to attempt?\n");
        System.out.println("1)Find Force (know m+a)");
        System.out.println("2)Find Net Force (know Fup+Fdown+Fleft+Fright)");
        System.out.println("3)Find Acceleration (know v1+v2+t)");
        System.out.println("4)Find Gravitational Potential Energy (know m+h)");
        System.out.println("5)Average Grades\n");
        
        calculationChoice = keyedInput.nextInt();
        System.out.println("Choice is:"+calculationChoice); //test
        
        switch (calculationChoice) {
            case 1:
                forceOneOut();
                break;
            case 2:
                forceTwoOut();
                break;
        }
                
        
    }
    
}
