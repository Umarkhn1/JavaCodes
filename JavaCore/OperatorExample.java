package JavaCore;

public class OperatorExample {
    public static void main(String[] args) {
        boolean open = true;
        boolean close = false;

        //not,and,xor,or

        boolean b = !false;

        boolean b1= true && true;
        boolean b2 = true&&false;
        boolean b3 = false&&false;
        boolean b4 = false&&true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        b1= true || true;
        b2 = true ||false;
        b3 = false||false;
        b4 = false||true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        b1= true ^ true;
        b2 = true ^false;
        b3 = false^false;
        b4 = false^true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        boolean b5 = open && (close||b); //b !false znachit true close=true  open=true
        System.out.println(b5);
    }
}
