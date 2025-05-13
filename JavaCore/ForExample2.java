package JavaCore;

import java.util.Scanner;

public interface ForExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
int sum=0;
        for (int i = 1; i <=n ; i++) {
//            if(i!=3){
//                System.out.println(i);   //faqat 3 cqmidi sikldan
//              if (i!=3 && i==6){
//                  System.out.println(i); // sikldan faqat 6ni cqazadi
//
//             if(i%5==0){
//                 System.out.println(i); //faqat 5ga bolinadgan sonla
//                 sum+=i; //sum = sum +i;
//
//            }
            if(i%5==0 || i%3==0){ //3ga ham va 5ga ham bolinadgan sonla
                System.out.println(i);
            }
        }
//        System.out.println("Summa = " + sum);



    }
}
