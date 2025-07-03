package OOP.amaliyinheritanceB;

public class Sound extends Electronics {
    private int volume;

    public Sound(String brand,int power,Integer volume){
        super(brand, power);
        this.volume=volume;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Volume :"+volume);
    }
}
