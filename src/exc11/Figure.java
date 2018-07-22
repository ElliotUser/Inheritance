package exc11;

abstract public class Figure {
    private double dim1;
    private double dim2;

    public Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

    public double getDim1() {
        return dim1;
    }

    public double getDim2() {
        return dim2;
    }
}
