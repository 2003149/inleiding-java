package h04;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class Hoofstukvier extends Applet {


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
	setBackground(Color.black);
	setSize(1200,550);
	

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
		
	g.setColor(Color.green);
	
	g.drawRect(25,50,200,0);
	
	g.drawRect(25,100,200,100);
	
	g.drawRoundRect(25,250,200,100,10,10);
	
	g.drawRect(250,100,250,100);
	g.fillRect(250,100,250,100);
	
	g.setColor(Color.black);
	g.drawOval(250,100,250,100);
	
	g.setColor(Color.green);
	g.drawOval(250,250,250,99);
	g.fillOval(250,250,250,100);
	
	g.drawOval(550,100,250,100);
	g.drawArc(550, 100,250,100, 90, 82);
	g.fillArc(550, 100,250,100, 90, 82);
	
	g.drawOval(600,250,100,100);
}


}