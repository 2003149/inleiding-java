
package h06;


import java.applet.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

	

	@SuppressWarnings("serial")
	public class hoofdstuk6punt4 extends Applet {
	//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde
	// 5,9; 6.3; 6,9.
		
		int gemiddelde = (int) ((5.9+6.3+6.9)/3*10);
		double einde = (double) gemiddelde/10;
		
		
	//dingen die moeten gebeuren als het opstart(ook achter de schermen)
	public void init() { 
		
		setBackground(Color.white);
		setSize(1200,550);

	}
	//bijv. tekst x is van links naar recht y is van boven naar beneden
	public void paint (Graphics g) {
		int x = 50;
		int y =70;
		
		g.drawString("test " + einde, 100, 100);
		
	g.drawString("het gemiddelde is : "+(double)	(int)	(	(5.9+6.3+6.9)	/3*10)	/10 ,x,y);

	}
	
}

