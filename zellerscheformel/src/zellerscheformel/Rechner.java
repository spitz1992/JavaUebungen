package zellerscheformel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Rechner {

	public static void main(String[] args) {
		
		String sEingabe = JOptionPane.showInputDialog("Bitte geben Sie Ihre Rechenaufgabe ein! * für Multiplikation, / für Division, + für Addition, - für Subtraktion, ^ für Potzenrechnungen, % für Modulorechnungen");
		String searchStringAdd = "+";
		String searchStringSub = "-";
		String searchStringMul = "*";
		
		if (sEingabe.contains(searchStringAdd)) {
			System.out.println(Addition(sEingabe));		
		} else if (sEingabe.contains(searchStringSub)) {
			System.out.println(Subtraktion(sEingabe));
		} else if (sEingabe.contains(searchStringMul)) {
			System.out.println(Multiplikation(sEingabe));
		}
	}

	private static double Addition (String sEingabe) {
		System.out.println("Hier1");
		String [] parts = sEingabe.split("\\+");
		double dErgebnisAdd = 0;
		for (String s: parts) {
			double dAddition = Double.parseDouble(s);		
			dErgebnisAdd += dAddition;
			
		}
		return dErgebnisAdd;
	}
	
	private static double Subtraktion (String sEingabe) {
		System.out.println("Hier2");
		String [] parts = sEingabe.split("\\-");
		ArrayList<Double> dErgebnisSub = new ArrayList<Double>();
		for (String s: parts) {
			dErgebnisSub.add(Double.parseDouble(s));
		}
		double sum = dErgebnisSub.get(0);
		dErgebnisSub.remove(0);
		for (Double d: dErgebnisSub) {
			if (!dErgebnisSub.equals(null)) ;
			sum -= d;
		}
		return sum;
	}
	private static double Multiplikation (String sEingabe) {
		System.out.println("Hier3");
		String [] parts = sEingabe.split("\\*");
		double dErgebnisMul = 0;
		for (String s: parts) {
			double dMultiplikation = Double.parseDouble(s);		
			dErgebnisMul *= dMultiplikation;
			
			}
			return dErgebnisMul;
	}
}
