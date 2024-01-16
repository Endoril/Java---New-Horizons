/*
 * Beispiel für Verzinsung mit for-Schleife:
 */

public class ZinsenFor {

	public static void main(String[] args) {
		double startKapital = 100.0, zinssatz = 3.0;
		int jahre = 10;
		// ***********
		double aktuKapital = startKapital;
		double q = 1.0 + zinssatz/100.0; 	// z.B. 1.03 bei 3% Zinsen
		
		System.out.println
		("Auf welchen Betrag waechst ein Startkapital von "+startKapital+" Euro");
		System.out.println
		("bei einem Zinssatz von "+zinssatz+"% nach "+jahre+" Jahren an?\n");

		for (int i=1; i<=jahre; i++) {	// i:1..jahre: jahre viele Durchläufe
			aktuKapital = aktuKapital * q;	// Verzinsung
			System.out.println("Nach "+i+" Jahren: "+aktuKapital);
		}
		
		System.out.println
		("\nEin Startkapital von "+startKapital+" Euro");
		System.out.println
		("waechst bei einem Zinssatz von "+zinssatz+"% nach "+jahre+" Jahren");
		System.out.println("auf "+aktuKapital+" an.");
	}

}
