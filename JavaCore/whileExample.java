package JavaCore;

import java.util.Scanner;

public class whileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        int i = 0;

//        while(n>i){
//            System.out.println(i);
//            i++;

//        }
//        String number = "";
//        while(n>0){
//            int q= n%10;
//            n=n/10;
//            number +=q;
//        }
//        System.out.println(Integer.parseInt(number));
//        int number1 =0;       soni orqamacasi ogirib beradi 0 optashab
//while(n>0){
//    int q= n%10;
//    n=n/10;
//    number1=number1*10+q;
//}
//        System.out.println(number1);
        StringBuffer stringBuffer = new StringBuffer("" + n);
        System.out.println(stringBuffer.reverse());

    }
}
