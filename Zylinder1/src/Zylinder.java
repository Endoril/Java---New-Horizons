// Subklasse
class Zylinder extends Kreis {
    double hoehe;

    public void schreibeZylinder() {
        schreibeKreis(); // Aufruf der geerbten Methode
        System.out.println("Höhe: " + hoehe);
    }
}