/*
 * Beispiel für eine lookup-table:
 * An Stelle i soll die Fakultät von i stehen.
 * Somit ist nach Erstellen der Tabelle
 * in nur konstanter Zeit ein mehrfaches Auslesen der Fakultäten möglich.
 * Das ist sehr viel schneller als eine Neuberechnung!
 */

public class FakuFeld {

	public static void main(String[] args) {
		final int maxFaku = 10;
			// Deklaration des Feldes
		int[] fakuFeld = new int[maxFaku + 1];

			// Feld belegen: Schreibe an jede Stelle i 
			// zwischen 1 u. 10 die Fakultät von i
			// Diese wird durch Aufruf der Methode "faku(i)" berechnet
		for (int i=1; i<=maxFaku; i++)	// i:1..10
			fakuFeld[i] = faku(i);
		
			// Feld ausgeben:
		for (int i=1; i<=maxFaku; i++)
			System.out.println
			("Die Faku von "+i+" ist "+fakuFeld[i]);
	}

	public static int faku(int n) {
		int zwischenergebnis = 1;
		
		for (int i=1; i<=n; i++)
			zwischenergebnis *= i;
		
		return zwischenergebnis;
	}
}
