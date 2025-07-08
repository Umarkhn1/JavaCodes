package JavaCollection.lessons.linkedlist;

public class Employee {
    private String name;
    private int zarplata;
    private String orin;

    public Employee(String name, int zarplata, String orin) {
        this.name = name;
        this.zarplata = zarplata;
        this.orin = orin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZarplata() {
        return zarplata;
    }

    public void setZarplata(int zarplata) {
        this.zarplata = zarplata;
    }

    public String getOrin() {
        return orin;
    }

    public void setOrin(String orin) {
        this.orin = orin;
    }
}
