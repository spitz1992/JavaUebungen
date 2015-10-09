package zellerscheformel;

public class Primzahl {

	public static void main(String[] args) {

		int iZaehler = 1;

		while (true) {
			iZaehler++;
		
			if (pruefung(iZaehler) == true) {
				System.out.println(iZaehler);
			}
		}
	}

	private static boolean pruefung(int iZahl) {
		for (int i = 2; i < iZahl; i++) {
			 
			if ((iZahl % i) == 0) {
				return false;
			}
		} 
		return true;
	}

}
