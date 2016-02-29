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
public class q22 {
    public static void main(String args[]){
  Scanner keyboard=new Scanner(System.in);
  String name;
  int age;
  System.out.print("Hey, what's your name? ");
  name=keyboard.next();
  
  System.out.print("Ok, "+name+", how old are you? ");
  age=keyboard.nextInt();
  
  if (age<16)
  {System.out.println("You can't drive, "+name+".");
  }
  
  if (age<18)
  {System.out.println("You can't vote, "+name+".");
  }
  if (age<25)
  {System.out.println("You can't rent a car, "+name+".");
  }
  
    
}}
