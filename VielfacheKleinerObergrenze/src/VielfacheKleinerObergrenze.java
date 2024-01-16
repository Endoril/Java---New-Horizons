/*
 * Aufgabe:
 * Ausgabe aller Vielfachen einer großen, krummen Zahl,
 * die kleiner als eine Obergrenze sind,
 * z.B. die Vielfachen von 179, die kleiner als 10000 sind
 */

public class VielfacheKleinerObergrenze {

	public static void main(String[] args) {
		int zahl = 179, obergrenze = 10000;
		// **********************************
		int vielfaches = zahl;

		System.out.println("Die Vielfachen der Zahl "+zahl+",");
		System.out.println("die kleiner sind als "+obergrenze+":\n");
		
		while (vielfaches < obergrenze) {
			System.out.print(vielfaches+" ");
			vielfaches = vielfaches + zahl;		// Infix: vielfaches += zahl;
		}
		
		System.out.println("\n\nDas waren alle Vielfachen von "+zahl+", ");
		System.out.println("die kleiner als "+obergrenze+" sind. ");
	}
}
