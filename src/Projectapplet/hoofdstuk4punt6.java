
package Projectapplet;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class hoofdstuk4punt6 extends Applet {
//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
setBackground(Color.white);
setSize(1200,550);

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
	
	g.setColor(Color.black);
	g.fillRoundRect(25,25,77,177,55,55);
	g.drawRoundRect(25,25,75,175,55,55);
	
	//*1rood
	g.setColor(Color.red);
	g.fillRoundRect(45,40,36,41,55,55);
	g.setColor(Color.black);
	g.drawRoundRect(45,40,35,40,55,55);
	
	
	//*2oranje
	g.setColor(Color.orange);
	g.fillRoundRect(45,90,36,41,55,55);
	g.setColor(Color.black);
	g.drawRoundRect(45,90,35,40,55,55);
	
	
	//*3 groen
	g.setColor(Color.green);
	g.fillRoundRect(45,140,35,41,56,55);
	g.setColor(Color.black);
	g.drawRoundRect(45,140,35,40,55,55);
	

	g.drawLine(55,200,55,300);
	g.drawLine(70,200,70,300);
	
	
	
}
	
	
	
}