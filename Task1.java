package lab8;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics; 
import java.awt.Color; 
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel; 

public class Task1 extends JPanel 
{ 
// draw rectangles and Strings in different colors 
public void paintComponent( Graphics g ) 
{ 
super.paintComponent( g ); // call superclass's paintComponent 

this.setBackground( Color.WHITE ); 
Graphics2D g2 = (Graphics2D) g;

Image img1 = Toolkit.getDefaultToolkit().getImage("a.jpg"); 
g.drawImage(img1, 350, 0,this);
g.setColor( Color.BLUE ); 
g.setFont( new Font( "SansSerif", Font.ROMAN_BASELINE, 20 ) );
g.drawString( "Mehmood Aktar " , 475, 375 ); 

//set new drawing color using integers 
g.setColor( new Color( 255, 0, 0 ) ); 
g.setFont( new Font( "Serif", Font.BOLD, 15 ) ); 
g.drawString( "MEHMOOD AKHTAR ", 10, 40 ); 

// set new drawing color using floats 
g.setColor( new Color( 0.50f, 0.75f, 0.0f ) ); 
g.setFont( new Font( "Monospaced", Font.ITALIC, 18 ) ); 
g.drawString( "13f-8268 " , 10, 65 ); 

//set new drawing color using static Color objects 
g.setColor( Color.BLUE ); 
g.setFont( new Font( "SansSerif", Font.ROMAN_BASELINE, 20 ) ); 
g.drawString( "E4i (EYE FOR INNOVATION)" , 10, 90 ); 

g.setColor( Color.magenta ); 
g.setFont( new Font( "PLAIN", Font.PLAIN, 22 ) ); 
g.drawString( "17 JANUARY " , 10, 115 ); 

GradientPaint redtowhite = new GradientPaint(5,7, Color.red, 100, 20, Color.yellow);
g2.setPaint(redtowhite);
g2.fill(new RoundRectangle2D.Double(20, 120, 75, 75, 20, 20));

GradientPaint redo = new GradientPaint(5,7, Color.GREEN, 120, 50, Color.yellow);
g2.setPaint(redo);
g2.fillOval(15, 200, 40, 50); 


g.setColor( new Color( 0, 0, 255 ) );
g.fillOval(28,295,12,12);
g.fillOval(350,295,12,12);
g2.draw(new CubicCurve2D.Double(30, 300, 150, 150, 200, 400, 350, 300));


} 
} 
