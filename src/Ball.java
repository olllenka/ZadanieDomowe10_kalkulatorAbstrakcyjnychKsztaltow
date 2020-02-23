public class Ball extends Shape3D {

    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public void showInfo(double volume){
        System.out.println("Kula o promieniu " + radius + " ma objętość " + volume);
    }

    public double getRadius() {
        return radius;
    }
}
