package h04;


	import java.applet.*;
	import java.awt.Color;
	import java.awt.Graphics;


@SuppressWarnings("serial")
	public class projecthoofstukvierpunteen extends Applet {


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
	public void init() { 
	setBackground(Color.black);
	setSize(1200,550);

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
	public void paint (Graphics g) {
		g.setColor(Color.GREEN);
		g.drawLine(50,100,100,50);
		g.drawLine(150,100,100,50);
		g.drawLine(50,100,150,100);
		

}


}