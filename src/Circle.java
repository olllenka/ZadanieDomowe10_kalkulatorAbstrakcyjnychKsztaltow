public class Circle extends GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void showInfo(double area){
        System.out.println("Koło o promieniu " + radius + " ma pole, które wynosi " + area);
    }
}
