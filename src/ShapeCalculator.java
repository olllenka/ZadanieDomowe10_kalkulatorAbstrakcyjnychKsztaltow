import static java.lang.Math.pow;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    private double circleArea(Circle circle) {
        return Math.PI*pow(circle.getRadius(),2);
    }

    private double rectangleArea(Rectangle rectangle) {
        return rectangle.getLength()*rectangle.getWidth();
    }

    private double ballVolume(Ball ball) {
        return 4/3*Math.PI*pow(ball.getRadius(),3);
    }

    private double cubeVolume(Cube cube) {
        return pow(cube.getLength(),3);
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        if(shape instanceof Circle)
            return circleArea((Circle) shape);
        else
            return rectangleArea((Rectangle) shape);
    }

    @Override
    public double volume(Shape3D shape) {
        if(shape instanceof Ball)
            return ballVolume((Ball) shape);
        else
            return cubeVolume((Cube) shape);
    }
}
