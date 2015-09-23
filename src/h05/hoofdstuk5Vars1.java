
package h05;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class hoofdstuk5Vars1 extends Applet {
//*Rechts boven 	|	 RechtBovenNaarBenedenEinde BovenNaarBenenEinde
    Color opvulkleur;
    Color opvulkleur2;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int hoogte2;
    String rh;
    String tro;
    String gr;
    
//dingen die moeten gebeuren als het opstart(ook achter de schermen)
public void init() { 
setBackground(Color.white);
setSize(1200,550);
breedte = 200;
opvulkleur = Color.MAGENTA;
opvulkleur2 = Color.green;
lijnkleur = Color.BLACK;
hoogte = 100;
hoogte2 = 50;
rh = "rechthoek";
tro  ="gevulderechthoekmetovaal";
gr = "taartpuntmetovaal";


}


//bijv. tekst x is van links naar recht y is van boven naar beneden
public void paint (Graphics g) {
	
	g.drawLine(100,50,breedte,hoogte2 );
	
    g.drawRect(100, 100, breedte, hoogte);
    
    g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
    
    g.setColor(opvulkleur);
    g.fillRect(315, 100, breedte, hoogte);
    
    g.setColor(lijnkleur);
    g.drawOval(315, 100, breedte, hoogte);
    
    g.setColor(opvulkleur2);
    g.fillOval(315, 225, breedte, hoogte);
    
    g.setColor(opvulkleur);
	g.drawOval(550,100,250,100);
	g.drawArc(550, 100,250,100, 90, 82);
	g.fillArc(550, 100,250,100, 90, 82);
    
    g.drawOval(550,225,100,100);
    
    g.drawString(rh, 150,220);
    g.drawString(tro, 350,220);
    g.drawString(gr, 650,220);
   
    


}
	
	
	
}