public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double s) {
        this.sides.clear();
        this.sides.add(s);
        this.sides.add(s);
        this.sides.add(s);
    }
}