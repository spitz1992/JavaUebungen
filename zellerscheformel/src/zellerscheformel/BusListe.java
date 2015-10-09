package zellerscheformel;

import javax.swing.JOptionPane;

public class BusListe {
	/**
	 * Gibt anhand einer Kategorienummer und der Anzahl an Passagieren eine Passagierliste zurück.
	 * 
	 * @param iBusKat
	 * 		Kategorienummer
	 * @param iAnzahl
	 * 		Anzahl Passagiere
	 * @return
	 * 		Liste mit Passagieren
	 */
	private static String[] passagiernamen(int iBusKat, int iAnzahl) {
		System.out.println("Sie haben Kat. " + iBusKat + " ausgewaehlt");

		String[] result = new String[iAnzahl];

		for (int iZaehler = 0; iZaehler < iAnzahl; iZaehler++) {
			result[iZaehler] = JOptionPane.showInputDialog(
					"Bitte geben Sie nun die Passagiernamen fuer die" + iBusKat + " der Reihe nach ein");

		}
		return result;
	}

	public static void main(String[] args) {
		String[] sBus = new String[0];
		int iZaehler = 0;

		String sBusKategorie = JOptionPane
				.showInputDialog("Welche Bus-Kategorie soll verwendet werden (Kat. 1, Kat. 2, Kat. 3");
		int iBusKategorie = Integer.parseInt(sBusKategorie);

		switch (iBusKategorie) {
		case 1:
			sBus = passagiernamen(1, 15);
			break;

		case 2:
			sBus = passagiernamen(2, 5);
			break;

		case 3:
			sBus = passagiernamen(3, 20);
			break;
		}

		// Ausgabe

		boolean b = true;
		while (b) {
			String sSuchmodus = JOptionPane.showInputDialog("Welchen Modus moechten Sie verwenden (S oder P)");

			switch (sSuchmodus) {
			case "P":
				String sSitzplatznummer = JOptionPane.showInputDialog("Bitte geben Sie die Sitzplatznummer ein");
				int iSitzplatznummer = Integer.parseInt(sSitzplatznummer);

				if (iSitzplatznummer > sBus.length || iSitzplatznummer < 0) {
					System.out.println("Diese Sitzplatznummer existiert nicht");
					break;
				}
				System.out.println(sBus[iSitzplatznummer]);
				break;

			case "S":
				String sPassagiername = JOptionPane.showInputDialog("Bitte geben Sie den Passagiernamen ein");
				boolean exists = true;

				for (iZaehler = 0; iZaehler < sBus.length; iZaehler++)
					if (sBus[iZaehler].equals(sPassagiername)) {
						System.out.println(iZaehler);
						exists = false;
						break;
					}
				if (exists) {
					System.out.println("Der Passagiername existiert nicht");
					break;
				}

				break;
			}
			String sAbfragWiederholung = JOptionPane.showInputDialog("Wollen Sie eine weitere Abfrage durchfuehren?");
			if (!sAbfragWiederholung.equals("J"))
				b = false;
		}
	}
}
