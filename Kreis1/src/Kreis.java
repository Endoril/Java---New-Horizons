
public class Kreis {
	double radius = 0.0;
	boolean isGefuellt = false;
	
	public double berechneUmfangKreis() {
		return 2.0 * 3.14 * radius;
	}
	
	public void schreibeKreis() {
		System.out.println
		("Der Kreis hat einen Radius von "+radius);
		System.out.println
		("Ist er gefuellt? "+isGefuellt);
	}
}
