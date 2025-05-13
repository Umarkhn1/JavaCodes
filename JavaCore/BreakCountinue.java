package JavaCore;

import java.util.Scanner;

public class BreakCountinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //break
//        for (int i = 0; i <n; i++) {          //sikl 5da toxtidi
////            if(i==5){
////                break;
////            }
////            System.out.println(i);

//        }
        out: for (int i = 0; i < 10; i++) {  // I ning har bita siklga J bitta polniy sikl qlb keladi
            for (int j = 0; j < 10; j++) {
                if(j==5) {
                    continue out;
                }
                System.out.println(i + " " + j);
            }

        }

    }
}
