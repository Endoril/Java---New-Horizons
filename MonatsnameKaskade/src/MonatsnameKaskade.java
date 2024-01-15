/*
 * Beispiel für eine lange (und umständliche) if-else-Kaskade
 */

public class MonatsnameKaskade {

	public static void main(String[] args) {
		int monatsnummer = 7;
		
		System.out.print  
		("Der Monat mit der Nummer "+monatsnummer+": ");
		
		if (monatsnummer == 1)
			System.out.println("Januar");
		else if (monatsnummer == 2)
			System.out.println("Februar");
		else if (monatsnummer == 3)
			System.out.println("Maerz");
		else if (monatsnummer == 4)
			System.out.println("April");
		else if (monatsnummer == 5)
			System.out.println("Mai");
		else if (monatsnummer == 6)
			System.out.println("Juni");
		else if (monatsnummer == 7)
			System.out.println("Juli");
		else if (monatsnummer == 8)
			System.out.println("August");
		else if (monatsnummer == 9)
			System.out.println("September");
		else if (monatsnummer == 10)
			System.out.println("Oktober");
		else if (monatsnummer == 11)
			System.out.println("November");
		else if (monatsnummer == 12)
			System.out.println("Dezember");
		else 	// ( (monatsnummer < 1) || (monatsnummer > 12) )
			System.out.println("ist kein gueltiger Monat!");

	}

}
