package sda.Prezentacja6;

public class Punkt2D {
    public static int liczbaStatyczna;
    private int liczbaNormalna;
    private double x, y;

    public Punkt2D() {
    }

    public Punkt2D(double x, double y) {
        liczbaStatyczna++;
        System.out.println("Liczba statyczna " + liczbaStatyczna);
        liczbaNormalna++;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double distance(Punkt2D pkt1, Punkt2D pkt2) { double result = 0.0;
        result = Math.sqrt(Math.pow(pkt2.x - pkt1.x, 2) + Math.pow(pkt2.y - pkt1.y, 2));
        return result;
    }
    public int getLiczbaNormalna() {
        return liczbaNormalna;
    }
    public void setLiczbaNormalna(int liczbaNormalna) {
        this.liczbaNormalna = liczbaNormalna;
    }
    public double calculateDistance(Punkt2D p) {
        double result;
        result = Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
        return result;
    }
}



//Moja wersja
/*public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Punkt2D p1 = new Punkt2D(1,1);
    Punkt2D p2 = new Punkt2D(4,5);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceBetweenPoints(int x, int y) {
        return Math.sqrt(((Math.pow(this.x - getX(), 2)) + Math.pow(this.y - getY(), 2)));

    }



}*/

