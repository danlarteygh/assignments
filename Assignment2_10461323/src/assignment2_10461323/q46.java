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
public class q46 {
    public static void main(String args[])
    {
        Random r= new Random();
        int x= 1+ r.nextInt(100);
        Scanner keyboard= new Scanner(System.in);
        int num;
        num= keyboard.nextInt(); 
        
        if (x==num)
        {
        System.out.println("");
        }
        else if (num>x)
        {
        System.out.println("Sorry,you are too high. I was thinking of "+x+".");
        } 
        else
        {
        System.out.println("Sorry,you are too low. I was thinking of "+x+".");
        }
        
    }
    }
    

