/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author DanLarteyGH
 */import java.util.Scanner;
import java.util.Arrays;
public class basicarray {
    public static void main(String args[])
    {
        System.out.println("Array of primitives");
        int[] ints={9,6,3};
        Arrays.sort(ints);
        for (int i=0; i<ints.length;i++)
        {System.out.println(ints[i]);};
                
            
        
        System.out.println("Array of strings");
        String[] strings={"red","green","blue"};
        Arrays.sort(strings);
        for (String  color: strings)
        {System.out.println(color);};
       
        System.out.println("Setting an initial size");
        int sized[]= new int[10];
        for(int i=0; i<sized.length;i++ )
        {
            //next line try sized[i]=sized[i]*100
            sized[i]=i*100;
            System.out.println(sized[i]);
        }
        
        System.out.println("Coping an array");
        int copied[]= new int[5];
        System.arraycopy(sized,5,copied,0,5);
        for (int value:copied){
            System.out.println(value);}
        
        
    }
    }
    
