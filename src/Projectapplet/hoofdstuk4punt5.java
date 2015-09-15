
package Projectapplet;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class hoofdstuk4punt5 extends Applet {
//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
setBackground(Color.blue);
setSize(1200,550);

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
	g.setColor(Color.YELLOW);
	g.drawOval(550,100,250,100);
	g.drawArc(550, 100,250,100, 90, 82);
	g.fillArc(550, 100,250,100, 90, 82);
}
	
	
	
}