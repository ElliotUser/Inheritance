package exc09;

public class Figure {
    private double dim1;
    private double dim2;

    public Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    public double area(){
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }

    public double getDim1() {
        return dim1;
    }

    public double getDim2() {
        return dim2;
    }
}
