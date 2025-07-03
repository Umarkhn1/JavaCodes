package OOP.amaliyinheritanceB;

public class Computers extends Electronics {
    private Integer memory;
    private String proccesor;

    public Computers(String brand,int power,Integer memory,String proccesor){
        super(brand,power);
        this.memory=memory;
        this.proccesor=proccesor;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Memory :"+memory+"\nProccesor :"+proccesor);
    }
}
