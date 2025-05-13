package JavaCore;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int array[] = new int[n];

        for (int i = 0; i <n; i++) {
          array[i]= scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {                            //kiritgan sonlani massivda cqazberadi
            System.out.print(array[i]+ " ");
        }

        int a[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,17};
        System.out.println("Kolichestvo chisel : " + a.length);

        int sum=0;
        for (int i = 0; i < a.length; i++) {            //summasi massivi
            sum+=a[i];
        }
        System.out.println("Summa :" + sum);

        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]) {
                max = a[i];
            }
        }
        System.out.println("max : " + max);

        int min=a[12];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Min : " + min);
    }
}
