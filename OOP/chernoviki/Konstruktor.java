package OOP.chernoviki;

public class Konstruktor {
    public static void main(String[] args) {
        Human odam = new Human("Bez",2);
    }
}
    class Human{
        private String ism;
        private Integer yow;

    public Human(String ism){
        System.out.println("1");
        this.ism=ism;
    }
    public Human(Integer yow){
        System.out.println("2");
    }
    public Human(){
        System.out.println("3");
    }
        public Human(String ism ,Integer yow){
            System.out.println("4");
        }
    }






