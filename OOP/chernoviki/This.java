package OOP.chernoviki;

public class This {
    public This(){
        System.out.println("first");
    }
public This(int a){
        this();
    System.out.println("second");
}


    public void object(This This){
        System.out.println("object argument");
    }

    public void object2(){
        object(this);
    }

    public This(Main main){
        System.out.println("konstruktor argument");
    }

This returnThis(){
        return this;
}

    public static void main(String[] args) {
        This This = new This(1);
        This.object2();
        This.returnThis().object2();


    }
}
