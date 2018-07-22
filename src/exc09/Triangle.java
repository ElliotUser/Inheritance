package exc09;

public class Triangle extends Figure {
    public Triangle(double a,double b){
        super(a,b);
    }

    public double area(){
        System.out.println("В области треугольника.");
        return getDim1()*getDim2()/2;
    }
}
