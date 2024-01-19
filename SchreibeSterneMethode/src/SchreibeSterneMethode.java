/*
 * Beispiel für den mehrfachen Aufruf einer Methode
 * an unterschiedlichen Stellen im Programm
 * Dadurch wird Quelltextduplizierung vermieden
 * u. das Programm ist leicht nachträglich änderbar,
 * wartbar u. erweiterbar
 */

public class SchreibeSterneMethode {

	public static void main(String[] args) {
		schreibeSterne();
		schreibeSterne();
		System.out.println("Java ist toll!");
		schreibeSterne();
		System.out.println("Ich liebe Java!");
		schreibeSterne();
		System.out.println("Java for ever!");
		schreibeSterne();
		schreibeSterne();
	}

	public static void schreibeSterne() {
		for (int i=1; i<=15; i++)	// i:1..15
			System.out.print("*");
		System.out.println();
	}
}
