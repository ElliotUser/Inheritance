package exc11;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figure;

        figure = r;
        figure.area();
        System.out.println("Площадь равна "+figure.area());

        figure = t;
        System.out.println("Площадь равна "+figure.area());
    }
}
