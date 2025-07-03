package OOP.chernoviki;

public class Point {
    private double x;
    private double y;
    private double z;
    private String Coordinates;
public Point(double x,double y,double z){
    this.x=x;
    this.y=y;
    this.z=z;
    Coordinates = "X:"+x+"; " + "Y:"+y+"; "+"Z:"+ z+";";

}

    public static void main(String[] args) {
        Point Coordinates = new Point(2,3,4);
        System.out.println(Coordinates.Coordinates);
    }
}