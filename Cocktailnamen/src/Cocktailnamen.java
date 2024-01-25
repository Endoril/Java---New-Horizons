
public class Cocktailnamen {

	public static void main(String[] meineArgumente) {
		final int maxAnzahl = 10;
		String[] cocktailliste = new String[maxAnzahl + 1];

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
		
		System.out.println("\nUnsere Cocktailkarte:\n");
		for (int i=1; i<=maxAnzahl; i++)
			System.out.println(i+". "+cocktailliste[i]);
	}

}
