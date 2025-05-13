package JavaCore;

import java.util.Scanner;

public class FloatingPointData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int n1 = scanner.nextInt();
        float n2 = scanner.nextFloat();          //malimotlani kiritishchun analog SIN c++

        System.out.println("birinchi" +n);
        System.out.println("ikkinchi" +n1);
        System.out.println("uchchinchi" +n2);

        //double,float(действительные)
        double num=1.0;
        double num1 = 1.2 + 2;
        System.out.println(num);
        System.out.println(num1);
        double pi=3.14;

        float f =1.0f;

        double ex = 5e-3;  //5*10^-3
        System.out.println(ex);
        double xe = 5e2;
        System.out.println(xe); //5*10^2





    }
}
