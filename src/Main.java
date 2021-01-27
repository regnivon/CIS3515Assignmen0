import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        EquilateralTriangle eq = new EquilateralTriangle("EqTriangle");
        Triangle tri = new Triangle("Triangle");
        Square sq = new Square("Square");

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Circle radius: ");
        double rad = Double.parseDouble(myObj.nextLine());
        circle.setDimensions(rad);

        System.out.println("Enter Equilateral Triangle length: ");
        double s = Double.parseDouble(myObj.nextLine());
        eq.setDimensions(s);

        System.out.println("Enter Triangle s1: ");
        double s1 = Double.parseDouble(myObj.nextLine());
        System.out.println("Enter Triangle s2: ");
        double s2 = Double.parseDouble(myObj.nextLine());
        System.out.println("Enter Triangle s3: ");
        double s3 = Double.parseDouble(myObj.nextLine());
        tri.setDimensions(s1,s2,s3);

        System.out.println("Enter Square length: ");
        double length = Double.parseDouble(myObj.nextLine());
        System.out.println("Enter Square height: ");
        double height = Double.parseDouble(myObj.nextLine());
        sq.setDimensions(length,height);


        Shape[] shapes = new Shape[]{
                circle,
                tri,
                sq,
                eq
        };

        for (Shape sp : shapes) {
            System.out.println(sp.getName());
            sp.printDimensions();
            System.out.println("Area: " + sp.getArea());
        }

    }

}
