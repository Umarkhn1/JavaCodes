package JavaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VAZIFA {
    public static void main(String[] args) {

        int secmax = 0;

        int[] a = {2, 5, 3, 8, 6};
        int max = a[3];
        for (int i = 0; i < a.length; i++) {
            if (max > a[i]) {
                secmax = a[i];
            }
        }
        System.out.println(secmax);

        int[] a1 = {10, 25, 33, 20, 18};
        int max1 = a1[2];
        for (int i = 0; i < a1.length; i++) {
            if (max1 > a1[i]) {
                secmax = a1[i];
            }
        }
        System.out.println(secmax);

        int[] a2 = {100, 50, 75, 200, 150};
        int max2 = a2[3];
        for (int i = 0; i < a2.length; i++) {
            if (max2 > a2[i]) {
                secmax = a2[i];
            }
        }
        System.out.println(secmax);

    }
}
        class VAZIFA2 {
    public static void main(String[] args) {
        int b[] = {2, 5, 3, 8, 6};
        int b1[] = {10, 25, 33, 20, 18};
        int b2[] = {100, 50, 75, 200, 150};
        System.out.println(main(b));
        System.out.println(main(b1));
        System.out.println(main(b2));

    }

    public static int main(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }
    }

class VAZIFA3 {
    public static void main(String[] args) {
        //3chi vazifa
        int c[] = {2, 5, 6, 8, 9};
        int c1[]= {10, 8, 5, 3, 2};
        int c2[]={100, 150, 175, 200, 250};
        System.out.println(sorted(c));
        System.out.println(sorted(c1));
        System.out.println(sorted(c2));
    }

    public static boolean sorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if(array[i]<=array[i-1]){
                return false;
            }
        }
        return true;
    }
}
class VAZIFA4 {
    public static void main(String[] args) {
        int d[] = {2, 5, 3, 5, 8, 6};
        int d1[] = {10, 25, 33, 20, 18, 25};
        int d2[] = {100, 50, 75, 200, 150, 50, 100};
        System.out.print("Duplicates in d: ");
        main(d);
        System.out.println();
        System.out.print("Duplicates in d1: ");
        main(d1);
        System.out.println();
        System.out.print("Duplicates in d2: ");
        main(d2);
        System.out.println();
    }

    public static int main(int[] array) {
        boolean duplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!duplicate) {
                        System.out.print(array[i]); // Первый дубликат
                        duplicate = true;
                    } else {
                        boolean alreadyprinted = false;
                        // Проверяем, не выводили ли это значение ранее
                        for (int k = 0; k < i; k++) {
                            if (array[k] == array[i]) {
                                alreadyprinted = true;
                                break;
                            }
                        }
                        if (!alreadyprinted) {
                            System.out.print(" " + array[i]); // Дополнительный дубликат с пробелом
                        }
                    }
                }
            }
        }
        return duplicate ? -1 : -1; // Сохраняем исходную логику возврата
    }
}

class MinMax {
    int min;
    int max;
    MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

class VAZIFA5 {
    public static void main(String[] args) {
        int e[] = {2, 5, 3, 8, 6};
        int e1[] = {10, 25, 33, 20, 18};
        int e2[] = {100, 50, 75, 200, 150};

        MinMax resultE = main(e);
        System.out.println("Array e: Min = " + resultE.min + ", Max = " + resultE.max);

        MinMax resultE1 = main(e1);
        System.out.println("Array e1: Min = " + resultE1.min + ", Max = " + resultE1.max);

        MinMax resultE2 = main(e2);
        System.out.println("Array e2: Min = " + resultE2.min + ", Max = " + resultE2.max);
    }

    public static MinMax main(int[] array) {

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return new MinMax(min, max);
    }
}

class VAZIFA6{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean x = false;
        boolean y = true;
        boolean p = true;
        boolean q = true;

        boolean and = a&&b;
        System.out.println(and);
        boolean or= a||b;
        System.out.println(or);
        boolean and1 = x&&y;
        System.out.println(and1);
        boolean or1= x||y;
        System.out.println(or1);
        boolean and2 = p&&q;
        System.out.println(and2);
        boolean or2= p||q;
        System.out.println(or2);



     }
}
class VAZIFA7{
    public static void main(String[] args) {
        boolean Uppercase=false;
        boolean Symbol=false;
        boolean Number=false;


        Scanner scanner = new Scanner(System.in);
        String parol = scanner.next();
        String specialSymbols="@#_%";


        if(parol.length()>8){
            System.out.println("Слишком длинный пароль");
        }
        for (char c : parol.toCharArray()) {
            if (Character.isUpperCase(c)) {
                Uppercase = true;
            }
            else if (Character.isDigit(c)){
                Number=true;
            }
            else if (specialSymbols.indexOf(c) != -1){
            Symbol=true;
            }
        }
        boolean Pravilno= Number&&Symbol&&Uppercase;

        System.out.println("Parol haqiqiy mi? " + Pravilno);

        // Закрытие Scanner
        scanner.close();
    }
}
class VAZIFA8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Farengeyt :");
        float Farengeyt= scanner.nextInt();
        float Selsiy=0f;

        Selsiy=(Farengeyt - 32) * 5/9;

        System.out.println("Selsiy " + Selsiy);

    }
}
class VAZIFA9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину : ");
        int a= scanner.nextInt();
        System.out.println("Введите ширину : ");
        int b= scanner.nextInt();
        int S=0;
        S=a*b;

        System.out.println("Ширина : " + S);


    }
}
class VAZIFA10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tugilgan kuningizni kiriting : ");
        int kun = scanner.nextInt();
        System.out.print("Tugilgan oyingizni kiriting : ");
        int oy = scanner.nextInt();
        System.out.print("Tugilgan yilingizni kiriting : ");
        int yil = scanner.nextInt();
        System.out.print("bugungi kun kiriting : ");
        int kun1 = scanner.nextInt();
        System.out.print("bugungi oyingizni kiriting : ");
        int oy1 = scanner.nextInt();
        System.out.print("bugungi yilingizni kiriting : ");
        int yil1 = scanner.nextInt();

        int kun2=kun1-kun;
        int oy2=oy1-oy;
        int yil2=yil1-yil;


        if(kun2<0){ //manfiy bosa oyi ayirvorib kun qoshamza
            oy2--;
            kun2+=30;
        }
        if(oy2<0){  //manfiy yili ayirib oy qoshamza
            yil2--;
            oy2+=12;

        }
        System.out.print("Farqi : "+ kun2+"."+oy2+"."+ yil2);

    }
}
