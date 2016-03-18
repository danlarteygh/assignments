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
public class Q54 {
    public static void main(String args[])
    {
        Random r= new Random();
        Scanner keyboard= new Scanner(System.in);
        int n=1,guess;
        System.out.print("I'm thinking of a number between 1-100.  You have 7 guesses.\nFirst guess: ");
        int ran=1+r.nextInt(100);
        guess=keyboard.nextInt();
        while(ran!=guess && n<7)
        {
         if(guess<ran)
            {
            System.out.print("Sorry, you are too low.\nGuess # "+(n+1)+": ");
            }
         else
         {
           System.out.print("Sorry, that guess is too high.\nGuess # "+(n+1)+": ");  
         }
         guess= keyboard.nextInt();
        
        n=n+1;
         }  
        
        
        if(ran==guess)
        { 
        System.out.println("You guessed it!  What are the odds?!?");
        }   
        else
        {
           System.out.println("Sorry, you didn't guess it in 7 tries.  My number is "+ran+".");     
        }
        
    
    
    
}}
