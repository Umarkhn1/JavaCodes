package OOP.chernoviki;

public class MEthodOver {

    public void display(){
        System.out.println("method1");
    }
    public void display(int a,int b){
        int s;
        s=a*b;
        System.out.println("S : "+s);
    }
    public float display(float a, float b){
         float P;
        P= a+b;
        System.out.println(P);
        return P;
    }
    public void sum(int c,int d){
        System.out.println("Int");
    }
    public void sum(long c,long d){
        System.out.println("long");
    }


    public static void main(String[] args) {
MEthodOver lesson=new MEthodOver();
        lesson.display(1,2);
        lesson.display(2.1f,2.2f);
        lesson.sum(2L,2L);
        lesson.sum(2,2);
    }
}
