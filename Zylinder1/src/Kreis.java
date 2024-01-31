class Kreis {
    double radius;
    boolean isGefuellt;

    public void schreibeKreis() {
        System.out.println("Radius: " + radius);
        System.out.println("Gefüllt: " + isGefuellt);
    }

    public double berechneUmfangKreis() {
        return 2 * Math.PI * radius;
    }
}