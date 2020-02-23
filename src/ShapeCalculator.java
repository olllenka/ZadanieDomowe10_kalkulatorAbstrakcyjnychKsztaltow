import static java.lang.Math.pow;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return Math.PI*pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getLength()*rectangle.getWidth();
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4/3*Math.PI*pow(ball.getRadius(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return pow(cube.getLength(),3);
    }
}
