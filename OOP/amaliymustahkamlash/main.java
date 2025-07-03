package OOP.amaliymustahkamlash;

public class main {
    public static void main(String[] args) {
        Person person =new Person("Tom","Brooklyn");
        System.out.println(person.toString());
        Student student = new Student("Umar","Huvaydo","JAVA",19,30.000);
        System.out.println(student.toString());
        Staff staff = new Staff("Bek","Russia","C",21,20.000,"Midtown school",4000);
        System.out.println(staff.toString());

    }
}
