package JavaCollection.lessons.LinkedHashMap;

import java.util.LinkedHashMap;


public class LinkedHashmapLesson {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Teacher> map = new LinkedHashMap<>();
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
//        map.put(1,"Tom");
//        map.put(2,"Jerry");
//        map.put(null,"Arthur");
//        map.put(2,"Jerry");
//        map.remove(1);
//        map.replace(2,"Harry");
//        for (Map.Entry m : map.entrySet()){
//            System.out.println(m.getKey() + " = " + m.getValue());
//        }

        Teacher teacher = new Teacher("Tom","Math");
        Teacher teacher1 = new Teacher("Brad","Physics");
        map.put(1,teacher);
        map.put(2,teacher1);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}
