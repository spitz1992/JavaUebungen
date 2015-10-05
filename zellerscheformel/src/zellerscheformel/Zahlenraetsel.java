package zellerscheformel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Zahlenraetsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int iObergrenze = 1000;
		int iZufallszahl = getRandomNumber(iObergrenze);
		int iVersuche = 1;
System.out.println(iZufallszahl);
		int iUsereingabe = 0;
		do {

			String sUsereingabe = JOptionPane
					.showInputDialog("Bitte geben Sie eine Zahl zwischen 1 und 1000 ein (0 für Abbruch)");
			iUsereingabe = Integer.parseInt(sUsereingabe);

			if (iUsereingabe == 0) {
				System.out.println("Schade! Es wÃ¤re die " + iZufallszahl + " gewesen!");
			} else if (iUsereingabe == iZufallszahl) {
				// TODO: Anzahl der Versuche anzeigen
				System.out.println("Gluekwunsch Sie haben mit " + iVersuche + " Versuchen die Zahl richtig erraten");
			} else if (iUsereingabe < iZufallszahl) {
				System.out.println("Eingegebene Zahl ist kleiner als Zufallszahl");
			} else {
				System.out.println("Eingegebene Zahl ist größer als Zufallzahl");
			}
			
			iVersuche ++;
		} while (iUsereingabe != iZufallszahl && iUsereingabe != 0);
	}

	static int getRandomNumber(int iObergrenze) {
		Random myRnd = new Random();
		int myRandomInt = myRnd.nextInt(iObergrenze + 1);

		if (myRandomInt == 0) {
			return getRandomNumber(iObergrenze);
		} else {
			return myRandomInt;
		}
	}
}
