/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10461323;

import java.util.Random;

/**
 *
 * @author DanLarteyGH
 */
public class q50 {
    
    public static void main (String args[])
    {
        Random r= new Random();
        int x= 1+r.nextInt(6);
        int y= 1+r.nextInt(6);
    System.out.println("HERE COMES THE DICE!");
   while(x!=y)    
   {
    x= 1+r.nextInt(6);
    y= 1+r.nextInt(6);
    System.out.println("Roll #1:" + x);
    System.out.println("Roll #2:" + y);
    System.out.println("The total is "+(x+y));
    }
    }
}
