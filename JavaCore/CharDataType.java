package JavaCore;

public class CharDataType {
    public static void main(String[] args) {
        char a ='\u0100';//8bit
        //u0010 unicode
        System.out.println(a);

        //hex agar '' yozsa soni jadvaldan qiymati oladi
        char hex = 64; //00 65535
        System.out.println(hex);


        //unicode orqali summa qlnvoti
        char lowercaseletter = 'a';
        char uppercaseletter = 'b';
        lowercaseletter = (char) (lowercaseletter+1);  //char hardoim bitta simvol blan yoziladi
        uppercaseletter +='c';
        System.out.println(lowercaseletter);
        System.out.println(uppercaseletter);
        lowercaseletter -=a;
        System.out.println(lowercaseletter);

    }
}
