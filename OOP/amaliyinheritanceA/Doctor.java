package OOP.amaliyinheritanceA;

public class Doctor {
    private Integer age;
    private String name;

    public Doctor(String name,Integer age){
        this.age=age;
        this.name=name;

    }
    public String Info(){
        return "Name : "+name+
                "\n"+"Age : "+age;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Steve",55);
        System.out.println(doctor.Info());
    }


}
