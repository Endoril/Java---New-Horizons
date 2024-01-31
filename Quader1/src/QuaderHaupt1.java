/*
 * Beispiel für Vererbung von Attributen u. Methoden
 */

public class QuaderHaupt1 {

	public static void main(String[] args) {
		System.out.println
		("Ich erzeuge einen Quader \"q1\":");
		Quader q1 = new Quader();
		
		// Belegen der Attribute:
		q1.laenge = 3;
		q1.breite = 4;
		q1.hoehe  = 5;
		
		q1.schreibeQuader();
	}

}
