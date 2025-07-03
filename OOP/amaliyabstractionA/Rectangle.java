package OOP.amaliyabstractionA;

public class Rectangle extends GeometricFigure {
    private double a;
    private double b;


    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String area() {
        return "S of rectangle : "+a * b;
    }

    @Override
    public String perimeter() {
        return "P of rectangle : "+2*(a+b);
    }
}

