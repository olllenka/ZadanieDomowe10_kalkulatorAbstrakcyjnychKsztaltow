public class Cube extends Shape3D {

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public void showInfo(double volume){
        System.out.println("Sześcian o długości krawędzi wynoszącej " + length + " ma objętość " + volume);
    }

    public double getLength() {
        return length;
    }
}
