
package Projectapplet;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class hoofdstuk4punt7 extends Applet {
//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
setBackground(Color.white);
setSize(1200,550);

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
	
	
	g.drawRoundRect(50,100,100,100,20,20);
	
	//*1
	g.drawRoundRect(70,120,25,25,50,50);
	//*2
	g.drawRoundRect(110,120,25,25,50,50);
	//*3
	g.drawRoundRect(70,160,25,25,50,50);
	//*4
	g.drawRoundRect(110,160,25,25,50,50);

	
	
	
	
	
	

	
	
	
}
	
	
	
}