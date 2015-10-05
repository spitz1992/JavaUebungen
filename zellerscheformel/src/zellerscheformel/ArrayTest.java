package zellerscheformel;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] iArray = {2,3,2,5,3,2};
		
		
		for (int i = 0; i<iArray.length; i++) {
			for (int a = 0; a<=iArray.length; a++)  {
				if (i < iArray[i]) {
					System.out.print("");
				} else {
					System.out.print("X");
				}
			}
			System.out.println();
			
		} 

	}

}
