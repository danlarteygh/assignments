/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10461323;

import java.util.Scanner;

/**
 *
 * @author DanLarteyGH
 */
public class q55 {
     public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);
            int n;
            int j;
                  
            System.out.println("I will add the numbers you gave me");
            n=input.nextInt();
            System.out.println("Give me aother one");
            while(n!=0)
            {
                 j=input.nextInt();
                n=n+j;
             if(j!=0)
              {
                  System.out.printf("The total so far is %d%n",n);
                System.out.printf("Enter another number%n");
              }
              else if(j==0)
              {
              System.out.printf("The total so far is %d%n",n);
                n=0;
              }
               
            }
            System.out.println("Please enter a non zero number");
            
    }
    
}
