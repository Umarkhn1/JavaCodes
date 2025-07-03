package OOP.amaliyabstractionA;

public class Trapezium extends GeometricFigure {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

public Trapezium(double a,double b, double c,double d, double h){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    this.h=h;
}

    @Override
    public String area() {
        return "S of trapezium : "+ ((a + b)*h)/2;
    }

    @Override
    public String perimeter() {
        return "P of trapezium : "+ (a+b+c+d);
    }

}
