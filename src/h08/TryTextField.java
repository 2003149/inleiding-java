package h08;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

		
	public class TryTextField extends Applet	{
	private static final long serialVersionUID = 1L;
	TextField tekstvak1;
	 Label label;		
		public void init()	{
			setSize(800,500);
			setBackground(Color.white);
			
			
			tekstvak1= new TextField("tiring",20);
			label = new Label("Type iets in het  tekstvakje");
			add(label);
			add(tekstvak1);

		}
		
		
		public void paint (Graphics g){

				
		}
		

		
		
	}