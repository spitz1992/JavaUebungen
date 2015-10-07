package zellerscheformel;

import javax.swing.JOptionPane;

public class SchraubenBestellung {

	public static void main(String[] args) {
	
		double dSchraube = 0.05;
		double dMutter = 0.03;
		double dUnterlegscheibe = 0.01;
		
		String sBestellungSchraube = JOptionPane.showInputDialog("Wie viele Schrauben möchten Sie bestellen? ");
		String sBestellungMutter = JOptionPane.showInputDialog("Wie viele Muttern möchten Sie bestellen? ");
		String sBestellungUnterlegscheibe = JOptionPane.showInputDialog("Wie viele Unterlegscheiben möchten Sie bestellen? ");
		
		double dBestellungSchraube = Double.parseDouble(sBestellungSchraube);
		double dBestellungMutter = Double.parseDouble(sBestellungMutter);
		double dBestellungUnterlegscheibe = Double.parseDouble(sBestellungUnterlegscheibe);
		
		double dErgebnisSchraube = dBestellungSchraube * dSchraube;
		double dErgebnisMutter = dBestellungMutter*dMutter;
		double dErgebnisUnterlegscheibe = dBestellungUnterlegscheibe * dUnterlegscheibe;
		
		double dGesamtbetrag = dErgebnisSchraube + dErgebnisMutter + dErgebnisUnterlegscheibe;
		
		if (dBestellungSchraube > dBestellungMutter) {
			JOptionPane.showMessageDialog(null, "Bitte überprüfen Sie Ihre Bestellung");
		} else {
			JOptionPane.showMessageDialog(null, "Ihre Bestellung ist in Ordnung! Der Gesamtbetrag beträgt " + dGesamtbetrag + " €");
		}

	}

}
