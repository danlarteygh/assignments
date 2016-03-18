/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10461323;
import java.util.Random;
/**
 *
 * @author DanLarteyGH
 */
public class q44 {
    public static void main (String args[])
    {
    Random r= new Random();
    int x=1+ r.nextInt(6);
    if (x==1)
    {
        System.out.println("Fortune cookie says: \"You will find happiness with a new love.\"");
    }
    else if (x==2)
    {
        System.out.println("Fortune cookie says: \"Stick with your wife.\"");
    }
    else if (x==3)
    {
        System.out.println("Fortune cookie says: \"You are getting employed tomorrow.\"");
    }
    else if (x==4)
    {
        System.out.println("Fortune cookie says: \"You'll have twins in future.\"");
    }
    else if (x==5)
    {
        System.out.println("Fortune cookie says: \"Be very careful today\"");
    }
    else
    {
        System.out.println("Fortune cookie says: \"Don't go home before 5.\"");
    }
   
    
    System.out.print( 1 + r.nextInt(54) + " - " );
    System.out.print( 1 + r.nextInt(54) + " - " );
    System.out.print( 1 + r.nextInt(54) + " - " );
    System.out.print( 1 + r.nextInt(54) + " - " );
    System.out.print( 1 + r.nextInt(54) + " - " );
    System.out.println( 1 + r.nextInt(54));
    }
    
}
