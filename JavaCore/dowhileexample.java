package JavaCore;

import java.util.Scanner;

public class dowhileexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int i = 0;

        do{
            i++;
            System.out.println(i);
        }
        while(n>i);

        System.out.println("___________");

        int k=0;
        while(n>k){
            k++;
            System.out.println(k);
        }

    }
}
