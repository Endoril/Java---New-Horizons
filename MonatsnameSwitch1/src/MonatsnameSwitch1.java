/*
 * Beispiel für einen Switch,
 * der -im Vergleich zur if-else-Kaskade
 * - kürzuer u. übersichtlicher ist.
 * Insbesondere muss die Variabel "monatsnummer",
 * über die "geswitcht" wird,
 * nur einmal erwähnt werden.
 */

public class MonatsnameSwitch1 {

	public static void main(String[] args) {
		int monatsnummer = 13;
		
		System.out.print  
		("Der Monat mit der Nummer "+monatsnummer+": ");
		
		switch (monatsnummer) {
			case 1:	System.out.println("Januar");	break;
			case 2:	System.out.println("Februar");	break;
			case 3:	System.out.println("Maerz");	break;
			case 4:	System.out.println("April");	break;
			case 5:	System.out.println("Mai");		break;
			case 6:	System.out.println("Juni");		break;
			case 7:	System.out.println("Juli");		break;
			case 8:	System.out.println("August");	break;
			case 9:	System.out.println("September");break;
			case 10:System.out.println("Oktober");	break;
			case 11:System.out.println("November");	break;
			case 12:System.out.println("Dezember");	break;
			default:System.out.println("ist kein gueltiger Monat!");
		}

	}

}
