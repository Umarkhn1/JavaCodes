package OOP.amaliyabstractionB;

public class amaliy2 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom\n","meow meow\n");
        System.out.println("Cat\n"+cat.getName()+cat.sound());
        Dogg dogg = new Dogg("Spike\n","bow bow\n");
        System.out.println("Dog\n"+dogg.getName()+dogg.sound());
        Duck duck = new Duck("Bob\n","quack quack");
        System.out.println("Duck\n"+duck.getName()+duck.sound());
    }
}
