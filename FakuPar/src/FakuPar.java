/*
 * Beispiel für eine Methode mit einem Parameter
 * Somit mehrfache Berechnung der Fakultät möglich,
 * ohne den Quelltext duplizieren zu müssen
 */

public class FakuPar {

	public static void main(String[] args) {
		faku(5);
		faku(3);
		faku(6);

	}

	public static void faku(int n) {
		int zwischenergebnis = 1;

		for (int i=1; i<=n; i++)	// i:1..n
			zwischenergebnis *= i;
		
		System.out.println(n+"! = "+zwischenergebnis);		
	}
}
