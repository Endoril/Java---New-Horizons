/*
 * Beispiel für einen Switch
 */

public class ZahlAlsWortSwitch {

	public static void main(String[] args) {
		int zahl = 3;
		
		System.out.println("Programm schreibt die Zahlen");
		System.out.println("von 1 bis 5 in Buchstaben!");
		System.out.print  (zahl+": ");

		switch (zahl) {
			case 1:	System.out.println("eins");		break;
			case 2:	System.out.println("zwei");		break;
			case 3:	System.out.println("drei");		break;
			case 4:	System.out.println("vier");		break;
			case 5:	System.out.println("fuenf");	break;
			default:System.out.println("liegt ausserhalb des Bereiches!");
		}
	}

}
