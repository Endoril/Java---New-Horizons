/*
 * Beispiel für eine zweiseitige bedingte Anweisungen
 */

public class BetragElse {

	public static void main(String[] args) {
		int a = 5;
		// ********
		int betrag;

		if (a>=0)		// 1. Bedingung
			betrag = a;
		else 	//if (a<0)		// 2. Bedingung
			betrag = -a;	// vorhandenes Vorzeichen eleminieren
		
		System.out.println("Der Betrag von "+a+" ist "+betrag);
	}

}
