/*
 * Beispiel für die Schachtelung von Methoden
 * Die Ebene im Baum für die Aufrufhierarchie
 * wird durch die Einrückung gekennzeichnet
 * in Form der Anzahl der Tabs
 */

public class Schachtel {

	public static void main(String[] args) {
		System.out.println("Hier beginnt das Hauptprogramm");
		m1();
		System.out.println("Hier ist das Hauptprogramm zurück");
		m2();
		System.out.println("Hier endet das Hauptprogramm");
	}

	public static void m1() {
		System.out.println("\tHier beginnt Methode m1()");
		m1a();
		m1b();
		System.out.println("\tHier endet Methode m1()");
	}
	
	public static void m1a() {
		System.out.println("\t\tHier ist Methode m1a()");
	}
	
	public static void m1b() {
		System.out.println("\t\tHier ist Methode m1b()");
	}
	
	public static void m2() {
		System.out.println("\tHier ist Methode m2()");
	}
	
}
