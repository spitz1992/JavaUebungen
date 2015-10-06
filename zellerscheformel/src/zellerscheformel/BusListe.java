package zellerscheformel;


import javax.swing.JOptionPane;

public class BusListe 
{

	public static void main(String[] args) 
	{
	
		String [] sBusKat1 = new String [15];
		String [] sBusKat2 = new String [20];
		String [] sBusKat3 = new String [30];
		
		int iZaehler = 0;
		
		String sBusKategorie = JOptionPane.showInputDialog("Welche Bus-Kategorie soll verwendet werden (Kat. 1, Kat. 2, Kat. 3");
		int iBusKategorie = Integer.parseInt(sBusKategorie);
		
		switch (iBusKategorie) 
		{
		case 1:
			System.out.println("Sie haben Kat. 1 ausgewählt");
			for (iZaehler = 0; iZaehler < sBusKat1.length; iZaehler++) 
			{
			sBusKat1 [iZaehler] = JOptionPane.showInputDialog("Bitte geben Sie nun die Passagiernamen für die Kat. 1 der Reihe nach ein");
			} 
			break;
			
		case 2:
			System.out.println("Sie haben Kat. 2 ausgewählt");
			for (iZaehler = 0; iZaehler < sBusKat2.length; iZaehler++) 
			{
				sBusKat2 [iZaehler] = JOptionPane.showInputDialog("Bitte geben Sie nun die Passagiernamen für die Kat. 2 der Reihe nach ein");
			}
			break;
		
		case 3:
			System.out.println("Sie haben Kat. 3 ausgewählt");
			for (iZaehler = 0; iZaehler < sBusKat3.length; iZaehler++) 
			{
				sBusKat3 [iZaehler] = JOptionPane.showInputDialog("Bitte geben Sie nun die Passagiernamen für die Kat. 3 der Reihe nach ein");
			}
			break;
		
		}
		
		//Ausgabe
		
		boolean b = true;
		while (b) {
			String sSuchmodus = JOptionPane.showInputDialog("Welchen Modus möchten Sie verwenden (S oder P)");
		
			switch (sSuchmodus)
			{
			case "P": 
				String sSitzplatznummer = JOptionPane.showInputDialog("Bitte geben Sie die Sitzplatznummer ein");
				int iSitzplatznummer = Integer.parseInt(sSitzplatznummer);
		
				if (iBusKategorie == 1) {
					if (iSitzplatznummer > sBusKat1.length || iSitzplatznummer <0) {
						System.out.println("Diese Sitzplatznummer existiert nicht");
						break;
					}
					System.out.println(sBusKat1 [iSitzplatznummer]);
				}
				if (iBusKategorie == 2) {
					if (iSitzplatznummer > sBusKat2.length || iSitzplatznummer <0) {
						System.out.println("Diese Sitzplatznummer existiert nicht");
						break;
					}
					System.out.println(sBusKat2 [iSitzplatznummer]);
				}
				if (iBusKategorie == 3) {
					if (iSitzplatznummer > sBusKat3.length || iSitzplatznummer <0) {
						System.out.println("Diese Sitzplatznummer existiert nicht");
						break;
					}
					System.out.println(sBusKat3 [iSitzplatznummer]);
				}
				break;
			
			case "S":
				String sPassagiername = JOptionPane.showInputDialog("Bitte geben Sie den Passagiernamen ein");
				boolean exists = true;
				
				if (iBusKategorie == 1) {
					for (iZaehler=0; iZaehler<sBusKat1.length; iZaehler++)
						if (sBusKat1 [iZaehler].equals(sPassagiername)) {
							System.out.println(iZaehler);
							exists = false;
							break;
					}
					if (exists) {
						System.out.println("Der Passagiername existiert nicht");
						break;
					}
				}
				if (iBusKategorie == 2) 
				{
					for (iZaehler=0; iZaehler<sBusKat2.length; iZaehler++)
						if (sBusKat2 [iZaehler].equals(sPassagiername)) 
						{
							System.out.println(iZaehler);
							exists = false;
							break;
						}
						if (exists) {
						System.out.println("Der Passagiername existiert nicht");
						break;
						}
				}
				if (iBusKategorie == 3) 
				{
					for (iZaehler=0; iZaehler<sBusKat3.length; iZaehler++)
						if (sBusKat3 [iZaehler].equals(sPassagiername)) 
						{
							System.out.println(iZaehler);
							exists = false;
							break;
						}
						if (exists) {
						System.out.println("Der Passagiername existiert nicht");
						break;
						}
				}
				break;
			}
			String sAbfragWiederholung = JOptionPane.showInputDialog("Wollen Sie eine weitere Abfrage durchführen?");
			if (!sAbfragWiederholung.equals("J")) 
				b = false;
		}
	}
}
	
