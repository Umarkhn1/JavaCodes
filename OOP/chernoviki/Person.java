package OOP.chernoviki;

public class Person {
    public void yosh(Integer yosh){
        System.out.println(yosh);
    }
    public void jins(String jins){
        System.out.println(jins);
    }

}
class object_olish{
    public static void main(String[] args) {
        Person Bich = new Person();
        Bich.yosh(18);
        Bich.jins("bola");
        Person Chmo = new Person();
        Chmo.yosh(19);
        Chmo.jins("Mujik");

    }
}