
public class KreisHaupt1 {

	public static void main(String[] args) {
		System.out.println
		("Ich erzeuge einen Kreis \"k1\":");
		Kreis k1 = new Kreis();
		
		// belegen der Attribute:
		k1.radius = 1.0;
		k1.isGefuellt = true;
		
		k1.schreibeKreis();
		
		System.out.println
		("Sein Umfang ist "+k1.berechneUmfangKreis());

	}

}
