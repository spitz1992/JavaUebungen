package zellerscheformel;

import javax.swing.JOptionPane;

public class BooleanTest {

	public static void main(String[] args) {
		String [] sEingabe = new String [2];
		double [] dEingabe = new double [sEingabe.length];
		
		for (int i = 0; i<sEingabe.length; i++) {
			sEingabe [i] = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein");
			boolean b = true;
			while (b) {
				try {
					dEingabe [i] = Double.parseDouble(sEingabe[i]);
					b = false;
				} catch (Exception e) {
					sEingabe [i] = JOptionPane.showInputDialog("Bitte wiederholen Sie Ihre Eingabe");
					b = true;
				}
			}
		}

		System.out.println(Durchschnitt(dEingabe));
		System.out.printf("%.2f", Durchschnitt(dEingabe));			
	}
			
	private static double Durchschnitt (double[] dEingabe) {
		double summe = 0;
		for (double s: dEingabe) {
			summe += s;	 
		}
		return summe / dEingabe.length;
	}
}
