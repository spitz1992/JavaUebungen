package zellerscheformel;

import java.util.Date;

public class Osterdatum {

	public static void main(String[] args) {
		
		for (int iZaehler = 2008; iZaehler <= 2048; iZaehler ++) {
			System.out.println(osterdatum(iZaehler).toGMTString());
			
		}
	}

	private static Date osterdatum (int iZahl) {
		
		int a = iZahl % 19;
		int b = iZahl % 4;
		int c = iZahl % 7;
		int k = iZahl  / 100;
		int p = (8*k + 13) / 25;
		int q = k / 4;
		
		int m = (15 + k -p -q) % 30;
		int d = (19*a + m) % 30;
		int n= (4+k-q) % 7;
		int e = (2*b + 4*c + 6*d +n) % 7;
		
		int iOstern = (22 + d + e);
		
		Date result = new Date ();
		result.setYear(iZahl);
		
		result.setMonth(2);
		result.setDate(iOstern);;
		
	
		return result;
	}
}
