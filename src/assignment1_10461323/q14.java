/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10461323;

/**
 *
 * @author Dan GH
 */
import java.util.Scanner;

public class AskingQuestions {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int feet;
                int inches;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? \n Enter the feet first, and then the inches.\nFeet: " );
		feet = keyboard.nextInt();
                System.out.print( "Inches: " );
		inches = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + feet +"'"+inches+'"' + " tall and " + weight + " heavy." );
	}
    
}
