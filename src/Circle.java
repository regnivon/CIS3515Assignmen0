import java.lang.Math;

public class Circle extends Shape {

    public double radius;

    public Circle(String name) {
        super(name);
    }

    public void setDimensions(double radius) {
        this.radius = radius;
    }

    /** returns the area of the shape */
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void printDimensions(){
        System.out.printf("Radius: %f\n", radius);
    }
}