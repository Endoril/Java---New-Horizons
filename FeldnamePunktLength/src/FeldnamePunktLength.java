/*
 * Felder unterschiedlicher Länge in Methoden bearbeiten
 * Übergabe der Felder an Methoden
 * Bezug auf <feldname>.length,
 * um zusätzlichen Parameter einzusparen
 * Hier: alte Version mit Parameterübergabe:
 * Aufwändiger u. fehleranfällig
 */
public class FeldnamePunktLength {

	public static void main(String[] args) {
		int[] feld1 = new int[5];
		int[] feld2 = new int[10];
		int[] feld3 = new int[15];

		belegeFeld(feld1, 5);
		belegeFeld(feld2, 10);
		belegeFeld(feld3, 15);
		
		ausgabeFeld(feld1, 5);
		ausgabeFeld(feld2, 10);
		ausgabeFeld(feld3, 15);
	}

		// zweiter Parameter für Feldlänge
	public static void belegeFeld(int[] feld, int feldlaenge) {
		for (int i=0; i<feldlaenge; i++)
			feld[i] = i+1;	// Belegung mit Ele-Nr.
	}
	
	public static void ausgabeFeld(int[] feld, int feldlaenge) {
		for (int i=0; i<feldlaenge; i++)
			System.out.print(feld[i]+" ");	
		System.out.println();
	}
}
