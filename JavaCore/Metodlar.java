package JavaCore;

public class Metodlar {                    //metodi caqrb tayyor algoritmlani iwlatsa boladi yana bowdan yozmaslichun
    public static void main(String[] args) { // void bosa qiymat qaytarmidi
     Metodlar metodlar = new Metodlar();
     metodlar.getgays("gay");
        System.out.println(metodlar.summa(3,4));
    }


    public static void getgays(String message) {
        System.out.println("Hello "+ message);
    }

    public int summa(int a,int b) {//qiymat qaytaradi

    return a+b;
    }
}
