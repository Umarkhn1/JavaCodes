package OOP.chernoviki;

public class Student {
    static int id;
    String name;
    static String institut = "TATU";

public Student(int id,String name){
    this.id=id;
    this.name=name;

 }

    public void print() {
        System.out.println(id+" "+name+" "+institut);


    }
    public Student(){
    id++;
        System.out.println(id);
    }
}