package OOP.chernoviki;

public class Togri_burchakli_uchburchak {

    private double a_tomon;
    private double b_tomon;
    private double c_tomon;
    private double Perimeter;
    private double Plowad;

    public Togri_burchakli_uchburchak(double a, double b, double c) {
        this.a_tomon=a;
        this.b_tomon=b;
        this.c_tomon=c;

        Perimeter=a+b+c;

    }
    public Togri_burchakli_uchburchak(int a, int b, int c) {
        this.a_tomon=a;
        this.b_tomon=b;
        this.c_tomon=c;

        Perimeter=a+b+c;

    }
    public Togri_burchakli_uchburchak(float a, float b, float c) {
        this.a_tomon=a;
        this.b_tomon=b;
        this.c_tomon=c;

        Perimeter=a+b+c;

    }
    public Togri_burchakli_uchburchak(long a, long b, long  c) {
        this.a_tomon=a;
        this.b_tomon=b;
        this.c_tomon=c;

        Perimeter=a+b+c;

    }
    public Togri_burchakli_uchburchak(double a, double b){
        this.a_tomon=a;
        this.b_tomon=b;
        Plowad=(a*b)/2;

    }

    public Togri_burchakli_uchburchak(int a, int b){
        this.a_tomon=a;
        this.b_tomon=b;
        Plowad=(a*b)/2;

    }

    public Togri_burchakli_uchburchak(float a, float b){
        this.a_tomon=a;
        this.b_tomon=b;
        Plowad=(a*b)/2;

    }

    public Togri_burchakli_uchburchak(long a, long b){
        this.a_tomon=a;
        this.b_tomon=b;
        Plowad=(a*b)/2;

    }

    public static void main(String[] args) {
Togri_burchakli_uchburchak Perimeter = new Togri_burchakli_uchburchak(1.2, 2.2, 3.2);
Togri_burchakli_uchburchak Plowad = new Togri_burchakli_uchburchak(3L,3L);
        System.out.println("Perimeter : "+Perimeter.Perimeter);
        System.out.println("Plowad : "+Plowad.Plowad);

    }



}
