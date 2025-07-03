package OOP.amaliymustahkamlash;

public class Staff extends Student {
    private String school;
    private int pay;

public Staff(String name,String address,String program,int year,double fee,String school,int pay){
    super(name, address,program,year,fee);
    this.school=school;
    this.pay=pay;
}

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
