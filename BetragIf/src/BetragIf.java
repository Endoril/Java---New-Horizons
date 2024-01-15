/*
 * Beispiel für zwei unabhängige einseitig bedingte Anweisungen
 */

public class BetragIf {

	public static void main(String[] args) {
		int a = -5;
		// ********
		int betrag = 0;

		if (a>=0)		// 1. Bedingung
			betrag = a;
		
		if (a<0)		// 2. Bedingung
			betrag = -a;	// vorhandenes Vorzeichen eleminieren
		
		System.out.println("Der Betrag von "+a+" ist "+betrag);
	}

}
