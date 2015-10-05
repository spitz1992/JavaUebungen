package zellerscheformel;

import javax.swing.JOptionPane;

public class BreakContinue {

	public static void main(String[] args) {
	

	String sEingabe = JOptionPane.showInputDialog("Bitte geben Sie einen Wert ein");
	int iEingabe = Integer.parseInt(sEingabe);
	
		for (int iZaheler = 2; iZaheler <= (iEingabe / 2); iZaheler++) {
			if (iEingabe % iZaheler == 0) {
				System.out.println(iEingabe +" Ist eine Primzahl");
				break;
			} else {
				System.out.println(iEingabe + " Ist keine Primzahl");
				break;
			}
		}
	}
	
	 public boolean istPrimzahl(int p){
	      boolean istPrim = true;
	      if (p < 2) return false;          
	                      
	      for (int i=2; i <= Math.sqrt(p); i++){
	         if (p%i == 0){
	            istPrim = false;
	            break;
	         }
	      }             
	      return istPrim;
	   }
}
		
	