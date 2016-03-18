/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10461323;

import java.util.Scanner;

/**
 *
 * @author DanLarteyGH
 */
public class q66 {
     public static void main(String[] args) {
        //variable decalaration and Scanner object creation
        int userInput;
        Scanner input = new Scanner (System.in);
        System.out.print("Count to: ");
        userInput = input.nextInt();
        for (int i = 0; i <= userInput; i++) {
            System.out.println(i + " ");
        }
    }
    

}
