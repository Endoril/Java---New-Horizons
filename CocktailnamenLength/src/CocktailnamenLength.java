/*
 * Beispiel für die Benutzung der Konstante <feldname>.length:
 * Wir beziehen uns in der Methode "ausgabeFeld" auf diese
 * in Form von "cocktailliste.length"
 * Damit kann die Übergabe des bisherigen Parameters "maxAnzahl" enfallen:
 * Kürzer von Quelltext, ein Parameter weniger Speicherbedarf,
 * kürzer in der Laufzeit u. übersichtlicher,
 * da ein Parameter weniger
 */

public class CocktailnamenLength {

	public static void main(String[] meineArgumente) {
		final int maxAnzahl = 10;
		String[] cocktailliste = new String[maxAnzahl + 1];

		belegeFeld(cocktailliste);
		ausgabeFeld(cocktailliste);
	}

	public static void belegeFeld(String[] cocktailliste) {
		cocktailliste[1] = "Pina Colada";
		cocktailliste[2] = "Zombie";
		cocktailliste[3] = "Mai Tai";
		cocktailliste[4] = "Swimmingpool";
		cocktailliste[5] = "Long Island Iced Tea";
		cocktailliste[6] = "Gin Basil Smash";
		cocktailliste[7] = "Midnight Cocktail";
		cocktailliste[8] = "London Mule";
		cocktailliste[9] = "Sex on the Beach";
		cocktailliste[10] = "Tequila Sunrise";		
	}
	
	public static void ausgabeFeld(String[] cocktailliste) {
		System.out.println("\nUnsere Cocktailkarte:\n");
			// Bezug auf <feldname>.length, hier: "cocktailliste.length"
		for (int i=1; i<cocktailliste.length; i++)
			System.out.println(i+". "+cocktailliste[i]);
	}
}
