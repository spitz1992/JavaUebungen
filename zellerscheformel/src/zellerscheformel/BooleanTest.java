package zellerscheformel;

import javax.swing.JOptionPane;

public class BooleanTest {

	public static void main(String[] args) {
		String [] sEingabe = new String [2];
		
		for (int i = 0; i<sEingabe.length; i++) {
			sEingabe [i] = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein");
			boolean b = true;
			while (b) {
				try {
					Double.parseDouble(sEingabe[i]);
					b = false;
				} catch (Exception e) {
					sEingabe [i] = JOptionPane.showInputDialog("Bitte wiederholen Sie Ihre Eingabe");
					b = true;
				}
			}
		}

		System.out.println(Durchschnitt(sEingabe));
		System.out.printf("%.2f", Durchschnitt(sEingabe));			
	}
			
	private static double Durchschnitt (String[] sEingabe) {
		double summe = 0;
		for (String s: sEingabe) {
			summe += Double.parseDouble(s);	 
		}
		return summe / sEingabe.length;
	}
}
