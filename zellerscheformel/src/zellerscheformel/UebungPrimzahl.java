package zellerscheformel;

public class UebungPrimzahl {

	public static void main(String[] args) {
		
		int [] iPrim = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for (int iZahl = 0; iZahl <= iPrim.length; iZahl ++) {
			if (iZahl %2 == 0) {
				System.out.println(iZahl + " = Ist eine gerade Zahl");
			} else {
				System.out.println();
			}
		}
		

	}

}
