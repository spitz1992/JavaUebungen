package zellerscheformel;

import javax.swing.JOptionPane;

public class ParkAutomat {

	public static void main(String[] args) {

		String sMuenzEingabe = JOptionPane.showInputDialog("Bitte M�nzen einwerfen (0.10� = 5Min) Aktzeptiert werden 0.10�, 0.20�, 0.50�, 1.00�, 2.00�");
		double dMuenzEingabe = Double.parseDouble(sMuenzEingabe);
		double dZeit = 0;
		
		String sTicketOderAbbruch = "0";

		if (dMuenzEingabe == 0.10 || dMuenzEingabe == 0.20 || dMuenzEingabe == 0.50 || dMuenzEingabe == 1.00 || dMuenzEingabe == 2.00) {
			dZeit = dMuenzEingabe / 0.10 * 5;
			JOptionPane.showMessageDialog(null, "Ihre Parkzeit betr�gt " + dZeit + " Minuten!");
			sTicketOderAbbruch=JOptionPane.showInputDialog("Bitte dr�cken Sie T f�r Ticket oder A f�r Abbruch!");
			if (sTicketOderAbbruch.equals("T")) {
				JOptionPane.showMessageDialog(null, "Ihr Ticket wird gedruckt");
			} else {
				System.exit(0);
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Ihre M�nzen werden nicht aktzeptiert!");
		}
		
	}

}
