package zellerscheformel;

import java.util.Random;

import javax.swing.JOptionPane;

public class SchnickSchnack {

	public static void main(String[] args) {

		Random myRnd = new Random();
		int myRandomInt = myRnd.nextInt(3);

		int iP = 0;
		int iS = 1;
		int iK = 2;
		String sZufallswert = null;

		switch (myRandomInt) {
		case 0:
			sZufallswert = "P";
			break;
		case 1:
			sZufallswert = "S";
			break;
		case 2:
			sZufallswert = "K";
			break;

		default:
			break;

		}
		String sUserEingabe = JOptionPane.showInputDialog(
				"Bitte geben Sie P für Papier, S für Schere, K für Kieselstein und Q für Quit (abbrechen) ein");

		if (sUserEingabe == sZufallswert) {
			System.out.println("Unentschieden");
		} else if (sUserEingabe.equals("P") && sZufallswert.equals("S")) {
			System.out.println("Computer gewinnt");
		} else if (sUserEingabe.equals("P") && sZufallswert.equals("K")) {
			System.out.println("User gewinnt");
		} else if (sUserEingabe.equals("K") && sZufallswert.equals("S")) {
			System.out.println("User gewinnt");
		} else if (sUserEingabe.equals("K") && sZufallswert.equals("P")) {
			System.out.println("Computer gewinnt");
		} else if (sUserEingabe.equals("S") && sZufallswert.equals("K")) {
			System.out.println("Computer gewinnt");
		} else if (sUserEingabe.equals("S") && sZufallswert.equals("P")) {
			System.out.println("User gewinnt");
		} else {
			System.exit(0);
		}
		
		main(args);
	}

}
