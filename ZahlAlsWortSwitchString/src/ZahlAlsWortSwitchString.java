/*
 * Beispiel für einen Switch
 * Bei dieser Version werden die Teile,
 * die ausgegeben werden sollen,
 * nicht direkt ausgegeben,
 * sondern in einem String "gesammelt"
 * u. zum Schluss als Ganzes ausgegeben.
 * Vorteil: Nur eine Ausgabeanweisung zum Schluss
 */

public class ZahlAlsWortSwitchString {

	public static void main(String[] args) {
		int zahl = 3;
		String s ="Programm schreibt die Zahlen\nvon 1 bis 5 in Buchstaben!\n"+zahl+": ";

		switch (zahl) {
			case 1:	s = s+"eins";		break;
			case 2:	s = s+"zwei";		break;
			case 3:	s = s+"drei";		break;
			case 4:	s = s+"vier";		break;
			case 5:	s = s+"fuenf";		break;
			default:s = s+"liegt ausserhalb des Bereiches!";
		}
		
		System.out.println(s);
	}
}
