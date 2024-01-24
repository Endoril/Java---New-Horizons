/*
 * Felder unterschiedlicher Länge in Methoden bearbeiten
 * Übergabe der Felder an Methoden
 * Bezug auf <feldname>.length,
 * um zusätzlichen Parameter einzusparen
 * Hier: neue Version ohne Parameterübergabe,
 * mit Bezug auf "feld.length":
 * kürzer, schneller, weniger Speicher, übersichtlicher
 */
public class FeldnamePunktLengthOptimiert {

	public static void main(String[] args) {
		int[] feld1 = new int[5];
		int[] feld2 = new int[10];
		int[] feld3 = new int[15];

		belegeFeld(feld1);
		belegeFeld(feld2);
		belegeFeld(feld3);
		
		ausgabeFeld(feld1);
		ausgabeFeld(feld2);
		ausgabeFeld(feld3);
	}

		// nur noch ein Parameter u. Bezug auf "feld.length"
	public static void belegeFeld(int[] feld) {
		for (int i=0; i<feld.length; i++)
			feld[i] = i+1;	// Belegung mit Ele-Nr.
	}
	
	public static void ausgabeFeld(int[] feld) {
		for (int i=0; i<feld.length; i++)
			System.out.print(feld[i]+" ");	
		System.out.println();
	}
}
