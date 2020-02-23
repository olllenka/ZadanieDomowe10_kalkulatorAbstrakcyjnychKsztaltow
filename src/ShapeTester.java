public class ShapeTester {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();

        Shape line = new Line2D(0,0,5,0);
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(2,5);
        Shape ball = new Ball(5);
        Shape cube = new Cube(5);

        Shape[] shapeArray = {line, circle, rectangle, ball, cube};

        for(int i=0; i<shapeArray.length; i++){
            if(shapeArray[i] instanceof Line2D){
                Line2D line2D = (Line2D) shapeArray[i];
                double length = shapeCalc.lineLength(line2D);
                line2D.showInfo(length);
            }
            else if(shapeArray[i] instanceof GeometricShape){
                GeometricShape geoShape = (GeometricShape) shapeArray[i];
                double area = shapeCalc.shapeArea(geoShape);
                geoShape.showInfo(area);
            }
            else if(shapeArray[i] instanceof Shape3D) {
                Shape3D shape3D = (Shape3D) shapeArray[i];
                double volume = shapeCalc.volume(shape3D);
                shape3D.showInfo(volume);
            }
        }

    }
}
