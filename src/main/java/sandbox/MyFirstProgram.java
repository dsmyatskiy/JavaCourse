package sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Point point1 = new Point(1, 1);
        Point point2 = new Point(6, 1);

        System.out.println(Point.distance(point1, point2));
    }
}
