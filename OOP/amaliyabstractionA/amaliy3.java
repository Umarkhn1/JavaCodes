package OOP.amaliyabstractionA;

public class amaliy3 {
    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium(1, 2, 3, 4, 5);
        System.out.println(trapezium.area());
        System.out.println(trapezium.perimeter());


        Triangle triangle = new Triangle(1, 2.2, 3.5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        Rectangle rectangle =new Rectangle(2.3,9.1);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

    }
}
