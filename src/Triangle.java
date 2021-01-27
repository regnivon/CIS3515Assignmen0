import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class Triangle extends Shape {

    List<Double> sides = new ArrayList<>();

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double s1, double s2, double s3) {
        this.sides.clear();
        this.sides.add(s1);
        this.sides.add(s2);
        this.sides.add(s3);
    }

    public double getPerimeter() {
        double sum = 0;
        for (double d : sides)
        {
            sum += d;
        }
        return sum;
    }

    public double heronsProduct() {
        double halfPerimeter = getPerimeter() * 0.5;
        double area = halfPerimeter;
        for (double d : sides)
        {
            area *= (halfPerimeter - d);
        }
        return area;
    }

    public double getArea() {
        return Math.sqrt(this.heronsProduct());
    }

    public void printDimensions(){
        for (int i =0; i < sides.size(); i++) {
            System.out.printf("Side %d: %f\n", i, sides.get(i));
        }
    }

}