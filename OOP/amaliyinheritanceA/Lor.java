package OOP.amaliyinheritanceA;

public class Lor extends Doctor {

    public Lor(Integer age,String name){
        super(name, age);

    }
 public static void main(String[] args) {
        Lor lor = new Lor(24,"Katya");
        System.out.println(lor.Info());
    }

}
