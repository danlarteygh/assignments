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
public class Q16 {
    public static void main( String[] args ){
        Scanner keyboard= new Scanner(System.in);
        String name;
        int age;
        double salary;
    System.out.println("Hello.  What is your name?");
    name= keyboard.next();
   System.out.println(name);
    System.out.println("Hi, "+ name+"! How old are you?");
   age = keyboard.nextInt();
   System.out.println(age);
    System.out.println("So you're " +age+", eh?  That's not old at all!\n" +
"How much do you make, "+name+"?");
    salary=keyboard.nextDouble();
     System.out.println(salary);
    System.out.println(salary+" I hope that's per hour and not per year! LOL!");
    
    
}
}