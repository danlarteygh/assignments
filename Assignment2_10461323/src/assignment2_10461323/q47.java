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
public class q47 {
    public static void main(String args[])
    {
        Random r= new Random();
        int x= 1+ r.nextInt(3);
        Scanner keyboard= new Scanner(System.in);
        int num;
        
        System.out.print("You slide up to Fast Eddie's card table and plop down your cash.\n" +
"He glances at you out of the corner of his eye and starts shuffling.\n" +
"He lays down three cards.\n" +
"\n" +
"Which one is the ace?\n" +
"\n" +
"	##  ##  ##\n" +
"	##  ##  ##\n" +
"	1   2   3 \n> ");
        
        num= keyboard.nextInt(); 
        
        if (x== num)
        { System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");   
        }
        else
        {System.out.println("Ha! Fast Eddie wins again! The ace was card number "+x+".");
        }
        
        
        
    
        if (x==1)
        {
        System.out.println("	AA  ##  ##\n" +"	AA  ##  ##\n" +"	1   2   3\n" +"\n" +"\n");
        }
        else if (x==2)
        {
        System.out.println("	##  AA  ##\n" +"	##  AA  ##\n" +"	1   2   3\n" +"\n" +"\n");
        } 
        else
        {
        System.out.println("	##  ##  AA\n" +"	##  ##  AA\n" +"	1   2   3\n" +"\n");
        }
        
    }}
    
    

