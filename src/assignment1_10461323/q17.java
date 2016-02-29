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
public class q17 {
    public static void main(String args[]){
    Scanner keyboard=new Scanner(System.in);
    
    String fname,lname,id,login;
    int grade;
    double gpa;
    
    System.out.print("First name: ");
    fname=keyboard.next();
    
    
     System.out.print("Last name: ");
      lname=keyboard.next();
   
     System.out.print("Grade: (9-12): ");
      grade=keyboard.nextInt();
   
     System.out.print("Student ID: ");
     id =keyboard.next();
   
     System.out.print("Login: ");
     login =keyboard.next();
   
     System.out.print("GPA (0.0-4.0): ");
     gpa =keyboard.nextDouble();
   System.out.println("\nYour information:");
     System.out.println("\t Login: "+login);
     System.out.println("\t ID:    "+id);
     System.out.println("\t Name:  "+lname+", "+fname);
     System.out.println("\t GPA    "+gpa);
     System.out.println("\t Grade: "+grade);
    
}}
