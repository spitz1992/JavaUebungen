package zellerscheformel;

public class ArrayUebungBalken {

	public static void main(String[] args) {
	
	int [] iaMayArray = {2,3,2,5,3,2};
		int ihighestvalue = 0;
		for (int i = 0; i < iaMayArray.length;i++){
			if (iaMayArray[i] > ihighestvalue) {
				ihighestvalue = iaMayArray[i];
			}
			
		}
		String sAusgabe = "";
		for (int n = ihighestvalue; n > 0;n--){
			for (int m = 0; m < iaMayArray.length; m++){
				if (iaMayArray[m] == n) {
					sAusgabe = sAusgabe + "x";
					int iTempValue = iaMayArray[m];
					iaMayArray[m] = iTempValue - 1;
				}
				else {
					sAusgabe = sAusgabe + " ";
				}
			}

			System.out.println(sAusgabe);
			sAusgabe = "";
		}

		System.out.println("------");
		System.out.println("012345");
	}

}
