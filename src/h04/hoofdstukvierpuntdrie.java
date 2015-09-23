
package h04;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class hoofdstukvierpuntdrie extends Applet {


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
setBackground(Color.white);
setSize(1200,550);

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
	g.setColor(Color.red);
	g.fillRect(100,0,100,30);
	g.setColor(Color.BLACK);
	g.drawRect(100,0,100,30);
	
	g.setColor(Color.white);
	g.fillRect(100,30,100,60);
	g.setColor(Color.BLACK);
	g.drawRect(100,30,100,60);
	g.drawLine(100,30,100,200);
	
	g.setColor(Color.blue);
	g.fillRect(100,60,100,30);
	g.setColor(Color.BLACK);
	g.drawRect(100,60,100,30);
	
	

	

}


}