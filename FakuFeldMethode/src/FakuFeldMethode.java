/*
 * Beispiel für die Übergabe von Feldern an Methoden:
 * Methoden "belegeFeld()" u. "ausgabeFeld()" werden ausgelagert.
 * Ihnen wird das Feld "fakuFeld" übergeben,
 * dass ich in der Methode allgemein "feld" nenne.
 */

public class FakuFeldMethode {

	public static void main(String[] args) {
		final int maxFaku = 10;
			// Deklaration des Feldes
		int[] fakuFeld = new int[maxFaku + 1];

		belegeFeld (fakuFeld, maxFaku);
		ausgabeFeld(fakuFeld, maxFaku);
	}

		// Methode nimmt ein Feld von integern entgegen,
		// das in der Methode unter dem Namen "feld" geführt wird
	public static void belegeFeld(int[] feld, int maxFaku) {
		for (int i=1; i<=maxFaku; i++)	// i:1..10
			feld[i] = faku(i);		
	}
	
	public static void ausgabeFeld(int[] feld, int maxFaku) {
		for (int i=1; i<=maxFaku; i++)
			System.out.println
			("Die Faku von "+i+" ist "+feld[i]);		
	}
	
	public static int faku(int n) {
		int zwischenergebnis = 1;
		
		for (int i=1; i<=n; i++)
			zwischenergebnis *= i;
		
		return zwischenergebnis;
	}
}
