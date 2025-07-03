package OOP.amaliyinheritanceA;

public class Xirurg extends Doctor {

    public Xirurg(String name,Integer age){
        super(name,age);

    }

    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Umar",19);
        System.out.println(xirurg.Info());
    }

}
