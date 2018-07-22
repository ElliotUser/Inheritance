package exc09;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figure;

        figure = r;
        System.out.println("Площадь равна "+figure.area());
        System.out.println();

        figure = t;
        System.out.println("Площадь равна "+figure.area());
        System.out.println();

        figure = f;
        System.out.println("Площадь равна "+figure.area());
        System.out.println();
    }
}
