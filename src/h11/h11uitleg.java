package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;



		
	public class h11uitleg extends Applet	{
	private static final long serialVersionUID = 1L;

	
	public void init()	{
		setSize(800,500);
		setBackground(Color.white);

		
	}
	
	
	public void paint (Graphics g){
		
//	hori
		int x = 30;
//	verti
		int y =10;
		
		int i = 0;
		while (i < 31){
				
		g.drawString(""+i,x,y);
		x +=20;
		i++;
	
		}

		
				
	}

	
}
