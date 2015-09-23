
package h06;


import java.applet.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;


	@SuppressWarnings("serial")
	public class hoofdstuk6punt2 extends Applet {
	//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde
		
		String	s;
		String	u;
		String	d;
		String	j;
		int	seconde;
		int	uur;
		int	dag;
		int jaar;
		int uitkomst;
		int uitkomst2;
		int uitkomst3;
		int uitkomst4;

	//dingen die moeten gebeuren als het opstart(ook achter de schermen)
	public void init() { 
		
		setBackground(Color.white);
		setSize(1200,550);
		s	="seconde :";
		u	="uur :";
		d	="dag :";
		j	="jaar :";
		
		seconde =60;
		uur	=24;
		dag		=365;
		uitkomst = seconde * seconde ;
		uitkomst2= uitkomst * uur  ;
		uitkomst3= uitkomst2 * dag;
		uitkomst4= uitkomst3 ;
	}
	
	
	//bijv. tekst x is van links naar recht y is van boven naar beneden
	public void paint (Graphics g) {
		
		g.drawString("hoeveel seconde zit er in een jaar",50,30);
		
		int x = 50;
		int y =70;
		
		g.drawString(u+uitkomst,x, y);
		y +=20;
		g.drawString(d+uitkomst2, x, y);
		y +=20;
		g.drawString(j+uitkomst3, x, y);
		y +=20;
		
	} 
	
}

