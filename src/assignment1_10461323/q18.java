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
public class q18 {
    int age;
    String name;
    public static void main(String ags []){
        int age;
    String name;
        Scanner keyboard= new Scanner(System.in);
    System.out.print("Hello.  What is your name? ");
    name=keyboard.next();
    System.out.println(name);
    System.out.print("Hi, "+name+"! How old are you? ");
    
   age =keyboard.nextInt();
    
    System.out.println(age);
    
    System.out.println("Did you know that in five years you will be "+Integer.toString(age+5)+" years old?\nAnd five years ago you were "+Integer.toString(age-5)+"! Imagine that!");
    
    
    
    
    
}}
