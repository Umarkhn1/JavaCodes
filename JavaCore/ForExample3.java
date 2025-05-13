package JavaCore;

import java.util.Scanner;

public class ForExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        for (int i = 0; i < 10; i++) {
//            if(i%2==1){
//                System.out.println(i);
//            }
//
//        }
        out: for (int i = 2; i < n; i++) {
            for (int j = 2; j <=i-1 ; j++) { //j<i/2
                if(i%j==0){
                    continue out;
                }
            }
            System.out.println(i);
        }
    }
}
