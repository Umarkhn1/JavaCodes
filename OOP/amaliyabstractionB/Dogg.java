package OOP.amaliyabstractionB;

public class Dogg extends Animals {
    private String name;
    public String sound;

    public Dogg(String name,String sound){
        this.name=name;
        this.sound=sound;
    }
    @Override
    public String getName() {
        return "Name : "+name;
    }

    @Override
    public String sound() {
        return "Sound : "+sound;
    }
}
