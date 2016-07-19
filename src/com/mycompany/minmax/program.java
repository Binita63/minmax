/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.minmax;

import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc =new Scanner(System.in);
      
       System.out.println("enter first number");
                int x= sc.nextInt();
      System.out.println("enter second number");
                int y= sc.nextInt();
       
       if(x>y){
           System.out.println("first number is greater");
       }
       else {
       System.out.println("second number is greater");
       }
        // TODO code application logic here
    }
    
}
