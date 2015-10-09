package zellerscheformel;

import javax.swing.JOptionPane;
public class zellersche {

	public static void main(String[] args) {
		String sEingabeUserTag ="";
		String sEingabeUserJahr ="";
		String sEingabeUserMonat ="";
		int iHundert =0;
		int iJahreszahl = 0;
		int iMonat = 0;
		int iTag = 0;
		
		
		sEingabeUserTag = JOptionPane.showInputDialog ("Eingabe Datum Tag");
		sEingabeUserMonat = JOptionPane.showInputDialog ("Eingabe Datum Monat");
		sEingabeUserJahr = JOptionPane.showInputDialog ("Eingabe Datum Jahr");
		iJahreszahl = Integer.parseInt(sEingabeUserJahr);
		iMonat = Integer.parseInt(sEingabeUserMonat);
		iTag = Integer.parseInt(sEingabeUserTag);
		
		System.out.print(sEingabeUserTag +"-"+sEingabeUserMonat +"-" + sEingabeUserJahr + "\t");
		iHundert = iJahreszahl / 100;
		iJahreszahl = iJahreszahl % 100;
		
		if(iMonat <3){
			iMonat = iMonat + 10;
			if(iJahreszahl == 0){
				iJahreszahl = 99;
				iHundert = iHundert - 1;
			}else{	
				iJahreszahl = iJahreszahl - 1;
			}
		}else{
			iMonat = iMonat -2;
		}
		int iWochentag = (iTag + (int)(2.61*iMonat-0.2)+iJahreszahl + (int)(iJahreszahl/4) + (int)(iHundert/4)-2*iHundert);
		if(iWochentag % 7 >= 0){
			iWochentag = iWochentag % 7;
		} else {
			iWochentag = 7 - iWochentag % 7;
		}
		switch (iWochentag)
		{
		case 0:
			System.out.println("Sonntag");
			break;
			
		case 1:
			System.out.println("Montag");
			break;
			
		case 2:
			System.out.println("Dienstag");
			break;
			
		case 3:
			System.out.println("Mittwoch");
			break;
			
		case 4:
			System.out.println("Donnerstag");
			break;
			
		case 5:
			System.out.println("Freitag");
			break;
			
		case 6:
			System.out.println("Samstag");
			break;
		}
		
	}

}
