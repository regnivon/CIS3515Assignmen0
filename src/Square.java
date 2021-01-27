public class Square extends Shape {

    double length;
    double height;

    public Square(String name) {
        super(name);
    }

    public void setDimensions(double length, double height) {
        this.height = height;
        this.length = length;
    }

    public double getArea() {
        return this.height * this.length;
    }
    public void printDimensions(){
        System.out.printf("Height: %f\n" +
                "Length: %f\n", this.height, this.length);
    }

}