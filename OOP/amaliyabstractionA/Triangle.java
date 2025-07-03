package OOP.amaliyabstractionA;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
           }

    @Override
    public String area() {
        double p = (a+b+c)/2;
        return "S of rectangle : "+sqrt(p*(a-p)*(b-p)*(c-p));
    }

    @Override
    public String perimeter() {
        return "P of triangle  : "+(a+b+c);
    }
}

