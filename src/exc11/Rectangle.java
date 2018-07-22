package exc11;

public class Rectangle extends Figure {

    public Rectangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("В области четырехугольника.");
        return getDim1()*getDim2();
    }
}
