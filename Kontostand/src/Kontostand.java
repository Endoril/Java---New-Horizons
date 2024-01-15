/*
 * Gewünschte Ausgabe:
 * 1. Das Konto ist im Haben
 * 2. Das Konto ist ausgeglichen
 * 3. Das Konto ist im Soll
 */

public class Kontostand {

	public static void main(String[] args) {
		double kontostand = 100.0;
		
		System.out.print  ("Das Konto ist ");
		
		if (kontostand > 0)			// 1. Bed.
			System.out.println("im Haben");
		else if (kontostand == 0)	// 2. Bed.
			System.out.println("ausgeglichen");
		else //if (kontostand < 0)	// 3. Bed.
			System.out.println("im Soll");
	}
}
