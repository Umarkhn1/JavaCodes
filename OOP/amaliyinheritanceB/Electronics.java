package OOP.amaliyinheritanceB;

public class Electronics {
    private String brand;
    private int power;
    public Electronics(String brand,int power){
        this.brand=brand;
        this.power=power;
    }
    public void display(){
        System.out.println("Brand :"+brand+"\nPower :"+power);
    }

}
