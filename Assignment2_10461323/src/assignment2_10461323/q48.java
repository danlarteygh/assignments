/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10461323;

/**
 *
 * @author DanLarteyGH
 */
import java.util.Scanner;

public class q48 {
    public static void main(String args[])
    {
    Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
                
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
    /*Answers to Questions:
    1. Both while and if have condition statements.
    2. The statements under an if statement are executed only once, but statements under a
       while statement may be executed more than once.
    3. Because,entry has already been declared.
    */
}
