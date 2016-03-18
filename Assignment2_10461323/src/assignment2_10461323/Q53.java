/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10461323;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DanLarteyGH
 */
public class Q53 {  public static void main(String args[])
    {
         Random r = new Random();

		int x = 1 + r.nextInt(10);
                System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
                 Scanner keyboard= new Scanner(System.in);
                 
                 System.out.print("Your guess: ");
                 int num= keyboard.nextInt();
                 int n =1;
                 while (num!=x)
                   {
                       n=n+1;
                       System.out.println("That is incorrect. Guess again.");
                       System.out.print("Your guess: ");
                       num= keyboard.nextInt();
                       
                   }
                 System.out.println("That's right! you are a good guesser.\nIt only took you "+n+" tries.");
                 
}
    
}
