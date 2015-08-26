package Projectapplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class appletsLeren extends Applet {

	  public void init() {
		setBackground(Color.blue);

	  }
	  
	  public void paint(Graphics g) {
		g.setColor(Color.red);
	    g.drawString("Welcome to Java!!", 50, 60 );
	  }
	}

