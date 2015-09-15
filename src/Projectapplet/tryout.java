package Projectapplet;


import java.awt.*;
import java.applet.*;

public class tryout extends Applet {
	String h;

  public void init() {
	    setBackground(Color.blue); 
	    h = "hallowereld";
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawRect(20, 20, 100, 50);
    g.fillRect(20, 80, 100, 50);
    g.drawString(h,50,50);
    
  }
}