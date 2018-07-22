package exc11;

public class Triangle extends Figure {

    public Triangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("В области треугольника.");
        return getDim1()*getDim2()/2;
    }
}
