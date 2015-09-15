
package Projectapplet;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class hoofdstuk4punt4 extends Applet {
//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde


//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
setBackground(Color.white);
setSize(1200,550);

}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
	
	//*namen pllats
	g.drawString("Valerie: 40 kg",10,260);
	g.drawString("Jeroen: 100 kg",10,280);
	g.drawString("Hans: 80 kg",10,300);
	
	
	//*verticaal

	g.drawLine(150,50,150,300);	
	//*horizontaal 
	g.drawLine(150,300,400,300);
	
	
//*diagramen

	g.drawString("100",115,100);
	g.drawString("90",120,120);
	g.drawString("80",120,140);
	g.drawString("70",120,160);
	g.drawString("60",120,180);
	g.drawString("50",120,200);
	g.drawString("40",120,220);
	g.drawString("30",120,240);
	g.drawString("20",120,260);
	g.drawString("10",120,280);
	g.drawString("0",130,300);
	
	//*jeroen
	
	g.setColor(Color.pink);
	g.fillRect(150,100,30,200);
	g.setColor(Color.BLACK);
	g.drawRect(150,100,30,200);
	
	//*hans
	
	g.setColor(Color.BLUE);
	g.fillRect(200,130,30,170);
	g.setColor(Color.BLACK);
	g.drawRect(200,130,30,170);
	
	//*Valerie
	
	g.setColor(Color.red);
	g.fillRect(250,220,30,80);
	g.setColor(Color.BLACK);
	g.drawRect(250,220,30,80);}


}