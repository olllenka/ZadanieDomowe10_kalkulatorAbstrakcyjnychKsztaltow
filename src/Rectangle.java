public class Rectangle extends GeometricShape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void showInfo(double area){
        System.out.println("Prostokąt o długościach boków " + length + " i " + width + " ma pole, które wynosi " + area);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
