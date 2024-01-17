/*
 * Beispiel "ZinsenWhile" wurde umgestaltet zu "ZinsenDo"
 * nach den Regeln aus Dokument "do-while-Schleife
 */

public class ZinsenDo {

	public static void main(String[] args) {
		double startKapital = 100.0, zinssatz = 3.0;
		// *****************************************
		double aktuKapital = startKapital;
		double q = 1.0 + zinssatz/100.0;
		int jahre = 0;
		
		System.out.println("Wie viele Jahre dauert es,");
		System.out.println
		("bis sich ein Startkapital von "+startKapital+" Euro");
		System.out.println
		("bei einem Zinssatz von "+zinssatz+"% verdoppelt hat?\n");
		
		do {	// do-while-Schleife
			System.out.println("Nach "+jahre+" Jahren: "+aktuKapital);
			aktuKapital = aktuKapital * q;	// Verzinsung
			jahre++;						// Hochzählen der Jahre
		} while (aktuKapital < 2.0*startKapital);
		
		System.out.println("\nEs dauert "+jahre+" Jahre,");
		System.out.println
		("bis sich ein Startkapital von "+startKapital+" Euro");
		System.out.println
		("bei einem Zinssatz von "+zinssatz+"% verdoppelt hat,");
		System.out.println("naemlich auf "+aktuKapital+" Euro.");
	}

}
