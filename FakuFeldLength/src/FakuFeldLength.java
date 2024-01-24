/*
 * Beispiel für die Benutzung der Konstante <feldname>.length
 * Sie ist überall verfügbar, wo das Feld zugreifbar ist.
 * Deshalb braucht die Feldgröße in den beiden Methoden
 * "belegeFeld()" u. "ausgabeFeld()" nicht übergeben werden.
 * Benefit: Kürzer vom Quelltext, ein Parameter weniger Speicherbedarf,
 * schneller in Berechnung, da Parameterübergabe unterbleibt
 * Auch übersichtlicher, da weniger Parmeter
 */

public class FakuFeldLength {

	public static void main(String[] args) {
		final int maxFaku = 10;
			// Deklaration des Feldes
		int[] fakuFeld = new int[maxFaku + 1];

			// nur noch das Feld wird übergeben, nicht mehr die Feldgröße
		belegeFeld (fakuFeld);	
		ausgabeFeld(fakuFeld);
	}

		// Methode nimmt ein Feld von integern entgegen,
		// das in der Methode unter dem Namen "feld" geführt wird
	public static void belegeFeld(int[] feld) {
		for (int i=1; i<feld.length; i++)	// i:1..10
			feld[i] = faku(i);		
	}
	
	public static void ausgabeFeld(int[] feld) {
		for (int i=1; i<feld.length; i++)
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
