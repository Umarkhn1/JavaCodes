package JavaCollection.amaliy.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        //1chi
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"Green");
        System.out.println(map);
        //2chi
        System.out.println(map.get(1));
        System.out.println(map.get(4));
        //3chi
        System.out.println(map.keySet());


    }
}
