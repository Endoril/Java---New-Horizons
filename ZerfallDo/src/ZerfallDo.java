
public class ZerfallDo {

	public static void main(String[] args) {
		double startWert = 1.0, grenzWert = 0.1;
		// **************************************
		double aktuWert = startWert;
		int hwz = 0;	// Halbwertszeit
		
		System.out.println("Wie lange dauert es,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println("nur noch weniger uebrig ist als der Grenzwert "+grenzWert+"?\n");
		
		if(startWert < grenzWert)
			System.out.println("Schon zu Beginn liegt der Startwert unter dem Grenzwert!");
		else {	// startwert >= grenzwert
			 do {	// do-while-Schleife
				System.out.println("Nach "+hwz+" HWZs: "+aktuWert);
				aktuWert /= 2; // Infix-Notation; alte Schreiweise: aktuWert = aktuWert / 2;		
				hwz++;
			} while (aktuWert >= grenzWert);
			
			System.out.println("\nEs dauert "+hwz+" Halbwertszeiten,");
			System.out.println("bis von einer Substanz der Menge "+startWert);
			System.out.println("nur noch weniger uebrig ist als der Grenzwert "+grenzWert+",");
			System.out.println("naemlich "+aktuWert+".");
		}
	}
}
