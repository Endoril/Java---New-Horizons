/*
 * Beispiel für einen Switch in einer weiter optimierten Version:
 * Ein String wird zu Beginn definiert,
 * der dann in der Kaskade erweitert
 * u. zum Schluss in nur einer Ausgabeanweisung
 * ausgegeben wird.
 * Dadurch Ersparnis an 12 (!) Ausgabeanweisungen.
 * Weiter mögliche Optimierung
 * (noch nicht offiziell eingeführt):
 * Infix-Schreibweise:
 * Statt:
 * 		s = s + "Mai";
 * per Infix-Notation:
 * 		s += "Mai";
 * 
 */

public class MonatsnameSwitch2 {

	public static void main(String[] args) {
		int monatsnummer = 1;
		
		String s = "Der Monat mit der Nummer "+monatsnummer+": ";
		
		switch (monatsnummer) {
			case 1:	s = s + "Januar";		break;
			case 2:	s = s + "Februar";		break;
			case 3:	s = s + "Maerz";		break;
			case 4:	s = s + "April";		break;
			case 5:	s = s + "Mai";			break;
			case 6:	s = s + "Juni";			break;
			case 7:	s = s + "Juli";			break;
			case 8:	s = s + "August";		break;
			case 9:	s = s + "September";	break;
			case 10:s = s + "Oktober";		break;
			case 11:s = s + "November";		break;
			case 12:s = s + "Dezember";		break;
			default:s = s +"ist kein gueltiger Monat!";
		}

		System.out.println(s);
		
	}

}
