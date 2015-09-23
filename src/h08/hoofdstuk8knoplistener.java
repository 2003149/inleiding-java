package h08;

import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

	
public class hoofdstuk8knoplistener extends Applet	{
private static final long serialVersionUID = 1L;

																			//*stap 1 voor 1Button | declareren
		Button Knop;
		String schermtekst;

	public void init()	{
		setBackground(Color.white);
		setSize(800,500);
		
		schermtekst = "doet deze knop wel iets ? a mafkeez! drukken dan";
																			//*stap 2 voor 1Button new knop aanmaken
		Knop = new Button("klikopmijKlootzak");
		KnopListener kl = new KnopListener();
        Knop.addActionListener(kl);
																			//*stap 4 voor 1Button toevoegen door add
		//*add altijd knop 			onderaan
		add (Knop);
		
		

	}
	
	
	public void paint (Graphics g){
		int x = 50;
		int y =70;
		
		g.drawString(schermtekst, x, y);
			
	}
	
	class KnopListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			schermtekst = "ja,deze knop doet wel iets pikkie!";
			repaint();
		}
		
		
	}
	
	
}