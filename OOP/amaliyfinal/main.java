package OOP.amaliyfinal;

public class main {
    public static void main(String[] args) {
        MyTime myTime =new MyTime(23,59,59);
        System.out.println(myTime.nextSecond());
        MyTime myTime1 =new MyTime(11,59,59);
        System.out.println(myTime1.nextMinute());
        MyTime myTime2 =new MyTime(20,59,59);
        System.out.println(myTime2.nextHour());

        MyTime myTime3 =new MyTime();
        System.out.println(myTime3.toString());


    }
}

