public class Zylinder1 {
    public static void main(String[] args) {
        System.out.println("Ich erzeuge einen Zylinder \"z1\":");
        Zylinder z1 = new Zylinder();

        // Belegen der Attribute:
        z1.radius = 2.0;
        z1.isGefuellt = false;
        z1.hoehe = 3.0;

        // Aufruf der Methode für den Zylinder:
        z1.schreibeZylinder();

        System.out.println("Sein Umfang ist " + z1.berechneUmfangKreis());
    }
}