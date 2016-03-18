/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials1;

import java.util.Scanner;

/**
 *
 * @author DanLarteyGH
 */
public class Adder {
     
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println();
        int number = input.nextInt();
        System.out.println("The sum of the digits is " +adder(number));
        
    }
    public static int adder(int num){
        int length = String.valueOf(num).length();
        int first , last , sum;
        if (length==1){
            return num;
        }
        else
        {
            first = num /10;
            last = num % 10;
            sum = last + adder(first);
        }
        return sum;
    }
    
}
