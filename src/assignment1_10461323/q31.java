/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10461323;

/**
 *
 * @author Dan GH
 */import javax.swing.*;
import java.awt.*;
public class q31 {
     public static void main( String[] args )
{
Frame613 f = new Frame613();
f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
f.setVisible(true);
}
}
class Frame613 extends JFrame
{
public Frame613()
{
setTitle("613 rocks!");
setSize(300,200);
setLocation(100,200);
Panel613 panel = new Panel613();
Container cp = getContentPane();
cp.add(panel);
}
}
class Panel613 extends JPanel
{
public void paintCcmpcnent( Graphics g )
{
super.paintComponent(g);
g.drawString("Hi",75,100);
}

    
}
