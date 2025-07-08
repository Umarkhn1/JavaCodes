package JavaCollection.lessons.LinkedHashMap;

public class Teacher {
    private String name;
    private String fan;

    public Teacher(String name, String fan) {
        this.name = name;
        this.fan = fan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", fan='" + fan + '\'' +
                '}';
    }
}
