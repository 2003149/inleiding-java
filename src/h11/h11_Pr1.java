package h11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_Pr1 extends Applet {
	
	TextField input1;
	Button ok;
	int inputgetal;
	int kanstringzien = 0;
	
    public void init() {
    	setSize(300, 300);
    	input1 = new TextField("", 10);
        ok = new Button("ok");
        ok.addActionListener((ActionListener) new okListener());
        add(input1);
        add(ok);
    	
    }
    
    public void paint(Graphics g) {
    	if(kanstringzien == 1) {
    		int x = 10;
        	int y = 60;
        	g.drawString("Tafel van "+inputgetal, x, y);
        	for(int i = 1; i < 11; i++) {
        		y += 15;
        		g.drawString(i+" x "+inputgetal+" = "+(inputgetal*i), x, y);
        	}
    	}
    	else
    		g.drawString("Tik een getal in", 30, 60);
    	
    	
    }
    
	class okListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			int tempgetal = Integer.parseInt(input1.getText());
			inputgetal = tempgetal;
			kanstringzien = 1;
			repaint();
		}
		
	}
	

}