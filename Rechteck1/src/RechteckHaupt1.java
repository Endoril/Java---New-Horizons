
public class RechteckHaupt1 {

	public static void main(String[] args) {
		// Erzeugen einer Instanz "r1" eines Rechtecks:
		Rechteck r1 = new Rechteck();
		
		// schreibender Zugriff auf die Attribute:
		r1.laenge = 3;
		r1.breite = 5;
		
		// lesender Zugriff:
		System.out.println("Laenge: "+r1.laenge);
		System.out.println("Breite: "+r1.breite);
	}

}
