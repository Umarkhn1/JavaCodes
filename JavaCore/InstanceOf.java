package JavaCore;

public class InstanceOf {       //
    public static void main(String[] args) {
        Car bmw = new Car();
        if(bmw instanceof Object){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        Integer a=4;
        if(a instanceof Integer){

        }
    }
}
