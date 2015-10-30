package h11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_Pr2 extends Applet {
	
	Button ok;
	int inputgetal = 1;
	
    public void init() {
    	setSize(300, 300);
        ok = new Button("ok");
        ok.addActionListener((ActionListener) new OkListener());
        add(ok);
    	
    }
    
    public void paint(Graphics g) {
    	
		int x = 10;
    	int y = 60;
    	g.drawString("Tafel van "+inputgetal, x, y);
    	for(int i = 1; i < 11; i++) {
    		y += 15;
    		g.drawString(i+" x "+inputgetal+" = "+(inputgetal*i), x, y);
    	}

    	
    }
    
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if(inputgetal == 10) inputgetal = 1;
			else 
				inputgetal++;
			repaint();
		}
		
	}
	

}