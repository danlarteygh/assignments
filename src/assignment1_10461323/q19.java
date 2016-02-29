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

public class q19 {
    public static void main(String args[]){
        double num1,num2,num3,ans;
        Scanner keyboard= new Scanner (System.in);
 System.out.print("What is your first number? ");  
 num1=keyboard.nextDouble();
    
 System.out.print("What is your second number? ");       
    num2=keyboard.nextDouble();
 System.out.print("What is your third number? ");       
    num3=keyboard.nextDouble();
    ans=(num1+num2+num3)/2;
    System.out.println("("+num1 +" + "+num2+" + "+num3+") / 2 is... "+ans);       
    
}}
