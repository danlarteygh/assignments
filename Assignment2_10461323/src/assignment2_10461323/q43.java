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
public class q43 {
    public static void main (String args[]){
     Random r = new Random();

		int x = 1 + r.nextInt(10);
                System.out.println("I'm thinking of a number from 1 to 10.\n" +"Your guess: ");
                 Scanner keyboard= new Scanner(System.in);
                 int num;
                 num= keyboard.nextInt();
                 if (num==x)
                 {System.out.println("That's right!  My secret number was "+x+"!");}
                 else
                 {System.out.println("Sorry, but I was really thinking of "+x+".");}
    }
    }
   

