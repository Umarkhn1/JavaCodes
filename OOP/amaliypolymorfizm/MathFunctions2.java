package OOP.amaliypolymorfizm;

public class MathFunctions2 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

/// ////////////////////////////////////////////
    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public float sub(float a,float b){
        return a-b;
    }


    /// //////////////////////////////////////
    public int mul(int a,int b){
        return a*b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public float mul(float a,float b){
        return a*b;
    }

    /// ////////////////////////////////////
    public int div(int a,int b){
        return a/b;
    }
    public double div (double a,double b){
        return a/b;
    }
    public float div (float a,float b){
        return a/b;
    }
    /// ///////////////////////////////////////////////
    public int abs(int a){
    return (a<0) ? -a : a;
    }
    public double abs(double a){
        return (a<0) ? -a : a;
    }
    public float abs(float a){
        return (a<0) ? -a : a;
    }
    /// //////////////////////////////////////
    public int pow(int a){
        return a*a;
    }
    public double pow(double a){
        return a*a;
    }
    public float pow(float a){
        return a*a;
    }
    public static void main(String[] args) {
        MathFunctions2 mathFunctions2 = new MathFunctions2();

        System.out.println(mathFunctions2.add(1,3));
        System.out.println(mathFunctions2.add(1.2,1.1));
        System.out.println(mathFunctions2.add(1f,3f));

        System.out.println(mathFunctions2.sub(1,2));
        System.out.println(mathFunctions2.sub(5.3,2.2));
        System.out.println(mathFunctions2.sub(4f,2.3f));

        System.out.println(mathFunctions2.mul(1,2));
        System.out.println(mathFunctions2.mul(1.5,2.3));
        System.out.println(mathFunctions2.mul(1.2f,2.5f));

        System.out.println(mathFunctions2.div(1,2));
        System.out.println(mathFunctions2.div(10.5,2));
        System.out.println(mathFunctions2.div(9.9f,3f));

        System.out.println(mathFunctions2.abs(-3));
        System.out.println(mathFunctions2.abs(-5.5));
        System.out.println(mathFunctions2.abs(-3.9));

        System.out.println(mathFunctions2.pow(9));
        System.out.println(mathFunctions2.pow(2.5));
        System.out.println(mathFunctions2.pow(3.5f));






    }
}
