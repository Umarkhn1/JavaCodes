package JavaCore;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int sum = 0;
//        //summa
//        for (int i = 1; i <= n; i++) {
//            System.out.println(" sum = "+ sum + " + "+i );
//            sum= sum+i; //sum+=i
//
//        }
//        System.out.println(sum);
//
int umnojenya = 1;
        for (int i = 1; i <=n ; i++) {
            System.out.println("umnojeniya = " + umnojenya + " * "+ i);
            umnojenya = umnojenya*i; //umnojenya*=i;
        }

        System.out.println("Otvet = "+ umnojenya);
    }
}
