package zellerscheformel;

public class ArrayUebung {

	public static void main(String[] args) {
	
		int [] iMyArray = {2, 3, 2, 5, 3, 2};
		int iZaehler = 0;
		
		for (iZaehler = 0; iZaehler < iMyArray.length; iZaehler ++) 
		{
			String sZaehler = " ";
			
				for (int iX = 0; iX <= iMyArray[iZaehler]; iX ++) {
				   
					sZaehler = sZaehler + "X";
				   
				}
				System.out.println(iZaehler + sZaehler);
		}
	}

}

