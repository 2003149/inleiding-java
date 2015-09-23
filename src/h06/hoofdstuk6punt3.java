
package h06;


import java.applet.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;


	@SuppressWarnings("serial")
	public class hoofdstuk6punt3 extends Applet {
	//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde
		

	//dingen die moeten gebeuren als het opstart(ook achter de schermen)
	public void init() { 
		
		setBackground(Color.white);
		setSize(1200,550);

	
	}
	//bijv. tekst x is van links naar recht y is van boven naar beneden
	public void paint (Graphics g) {
		g.drawString(""+(2000000000+1234567890),50,50);
		
		int x = 50;
		int y =70;

	}
	
}

