/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10461323;

/**
 *
 * @author Dan GH
 */import java.util.Scanner;
public class q26 {
    public static void main(String args[]){
        int planet;
        double weight;
        Scanner keyboard=new Scanner(System.in);
        
       System.out.print("Please enter your current earth weight: ");
       weight = keyboard.nextDouble();
       
       System.out.print("I have information for the following planets:\n" +
"   1. Venus   2. Mars    3. Jupiter\n" +
"   4. Saturn  5. Uranus  6. Neptune\n\nWhich planet ar e you visiting? ");
       
        
        planet=keyboard.nextInt();
    if ( planet == 1 )
		{
			weight = weight*0.79;
		}
		else if ( planet == 2 )
		{
			weight = weight*0.39;
		}
		else if ( planet == 3 )
                
                {weight = weight*2.65;
                    }        
                        else if ( planet ==4  )
		{
			weight =weight*1.17;
                }
                        
                        else if ( planet ==5  )
		{
			weight =weight*1.05;
                }
                        
                        else if ( planet == 6 )
		{
			weight = 1.23; 
                 }
       System.out.print("Your weight would be "+weight+"pounds on that planet.");                      
}}
