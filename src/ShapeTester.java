public class ShapeTester {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();

        Line2D line = new Line2D(0,0,5,0);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2,5);
        Ball ball = new Ball(5);
        Cube cube = new Cube(5);

        double lineLength = shapeCalc.lineLength(line);
        double circleArea = shapeCalc.circleArea(circle);
        double rectangleArea = shapeCalc.rectangleArea(rectangle);
        double ballVolume = shapeCalc.ballVolume(ball);
        double cubeVolume = shapeCalc.cubeVolume(cube);

        System.out.println("Długość linii: " + lineLength);
        System.out.println("Pole koła: " + circleArea);
        System.out.println("Pole prostokąta: " + rectangleArea);
        System.out.println("Objętość kuli: " + ballVolume);
        System.out.println("Objętość sześcianu: " + cubeVolume);

    }
}
