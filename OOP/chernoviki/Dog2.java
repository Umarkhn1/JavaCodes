package OOP.chernoviki;

public class Dog2 extends Dog {
    public void sleep(){
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.eat();
        dog2.security();
        dog2.sleep();

    }

}
