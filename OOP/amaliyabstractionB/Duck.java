package OOP.amaliyabstractionB;

public class Duck extends Animals {
    private String name;
    public String sound;


    public Duck(String name,String sound){
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
