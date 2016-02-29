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
public class q27 {
    public static void main(String args[]){
        int ans; 
        int score=0;
    Scanner keyboard=new Scanner (System.in);
        System.out.println("Are you ready for a quiz?\nHere it comes!");
       
        System.out.println("Q1) What is the capital of Alaska?\n" +
"	1) Melbourne\n" +
"	2) Anchorage\n" +
"	3) Juneau");
         ans=keyboard.nextInt();
         if (ans==3)
         {
             System.out.println("That's right!");
            score=score+1; 
         }
         else{System.out.print("Sorry, your answer is wrong");};
         System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" +
"	1) yes\n" +
"	2) no");
         ans=keyboard.nextInt();
         if (ans==2)
         {
             System.out.println("That's correct!");
            score=score+1; }
            else{System.out.println("Sorry, you answer is wrong");}
             
             System.out.println("Q3) What is the result of 9+6/3?\n" +
"	1) 5\n" +
"	2) 11\n" +
"	3) 15/3");
    ans=keyboard.nextInt();
    if (ans==2)
    {
         System.out.println("That's correct!");
            score=score+1; }
            else{System.out.println("Sorry, you answer is wrong\n");}
    System.out.println("Overall, you got "+score+" out of 3 correct.\n" +
"Thanks for playing!\n" +
"\n" +
"\n" +
"");
             
    
      
   }}