package OOP.chernoviki;

public class Dog extends Animal {

    public void security() {
        System.out.println("guarding");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    dog.eat();
    dog.security();

    }

}
