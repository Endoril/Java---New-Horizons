/*
 * Drittes Beispiel für die Infix-Notation: Fakultätsberechnung
 * Hergeleitet aus der Berechnung der Zweierpotenz
 * Der Laufindex "i" hat dabei eine Doppelbedeutung:
 * 1. Die Multiplikationen zu zählen: n Schleifendurchläufe,
 * nummeriert von 1 bis n
 * 2. i nimmt genau die Zahlen ein,
 * die aufmultipliziert werden sollen,
 * nämlich die von 1 bis n
 */

public class FakuInfix {

	public static void main(String[] args) {
		int n = 5;
		// ********
		int zwischenwert = 1;

		for (int i=1; i<=n; i++) {	// i:1..n
			zwischenwert *= i;	// Infix-Notation
		}
		
		System.out.println("Die Fakultaet von "+n+" ist "+zwischenwert);
	}

}
