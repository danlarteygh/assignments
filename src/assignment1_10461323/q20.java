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
public class q20 {
    public static void main(String args[])
    {
        double weight,height,fheight,iheight;
    Scanner keyboard=new Scanner(System.in);
    System.out.print("Your height in m: ");
    height=keyboard.nextDouble();
    System.out.print("Your weight in kg: ");
    weight=keyboard.nextDouble();
    System.out.println("Your BMI is "+Double.toString(weight/(height*height)));
    
    System.out.print("Your height in inches: ");
    height=keyboard.nextDouble();
    height=height*0.0254;
     System.out.print("Your weight in pounds: ");
    weight=keyboard.nextDouble();
    weight=weight*0.45359;
    System.out.println("Your BMI is "+Double.toString(weight/(height*height)));
   
    System.out.print("Your height (feet only): ");
    fheight=keyboard.nextDouble();
    System.out.print("Your height (inches): ");
    iheight=keyboard.nextDouble();
    height=(fheight+(iheight*0.0833333))*0.3048;
    System.out.print("Your weight in pounds: ");
    weight=keyboard.nextDouble();
    weight=weight*0.45359;
     System.out.println("Your BMI is "+Double.toString(weight/(height*height)));
   
}}
