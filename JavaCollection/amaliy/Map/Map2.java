package JavaCollection.amaliy.Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"Green");
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(5,"Pink");
        map1.put(6,"Yellow");
        map1.put(7,"Brown");
        map1.put(8,"White");

        map.putAll(map1);
        System.out.println(map);
        //2chi
        for (Map.Entry m : map.entrySet()){
            System.out.println("Value : "+m.getValue());
        }
        //3chi
        map.clear();
        map1.clear();
        System.out.println(map);
        System.out.println(map1);

    }
}
