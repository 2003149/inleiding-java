package h08;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

		
	public class TryTextField extends Applet	{
	private static final long serialVersionUID = 1L;
    TextField tekstvak;
    Label label;				
    String s;
		public void init()	{
			setSize(800,500);
			setBackground(Color.white);
	        tekstvak = new TextField("Klik op mij", 20);
	        label = new Label("Type iets in het tekstvak " + 
	            "en druk op enter");
	        tekstvak.addActionListener( new TekstvakListener() );
	        add(label);
	        add(tekstvak);
	        s = "";

		}
		
		
		public void paint (Graphics g){
			  g.drawString(s, 50, 60 );
				
		}
		
	    class TekstvakListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
	            s = tekstvak.getText();
	            repaint();
	        }	
		}

    }
