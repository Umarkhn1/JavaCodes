package OOP.amaliystatic;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathFunctions {
    private double radius;
    private double Yuza;
    private double YuzaGeron;
    private double p;

    public double Yuza(double PI,double R) {
        this.radius=R;
        Yuza = radius * radius * PI;
        return Yuza;

    }
    public double Yuza2(double a, double b, double c){
        p = (a+b+c)/2;
        YuzaGeron=sqrt(p*(p-a)*(p-b)*(p-c));
        return YuzaGeron;
    }
    public double E(double e,int a) {
    return pow(e,a);
    }

    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();
        System.out.println("Yuza Uchburchak : "+math.Yuza2(1.1,2,3));
        System.out.println("Doira Yuza : "+math.Yuza(3.14,5));
        System.out.println("e^a : "+math.E(2.71,4));
    }


}