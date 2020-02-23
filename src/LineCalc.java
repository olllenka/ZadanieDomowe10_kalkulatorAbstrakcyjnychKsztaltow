import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LineCalc {
    public double lineLength(Line2D line){
        return sqrt(pow(line.getX1() - line.getX2(),2) + pow(line.getY1() - line.getY2(),2));
    }
}
