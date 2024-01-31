
public class Quader extends Rechteck{
	int hoehe=0;
	
	public void schreibeQuader() {
//		System.out.println("Laenge: "+laenge);
//		System.out.println("Breite: "+breite);
// 		statt Quelltextduplizierung:
//		Aufruf der geerbten Methode
		schreibeRechteck();
		System.out.println("Hoehe : "+hoehe);	
	}
}
