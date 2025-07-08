package JavaCollection.amaliy.Map;


import java.util.TreeMap;
import java.util.TreeSet;

public class Map5 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"Green");
        //1chi
        System.out.println(map.headMap(3));
        //2chi
        TreeSet<Integer> set = new TreeSet<>(map.keySet());
        System.out.println(set);
        //3chi
        map.clear();
        System.out.println(map);

    }
}
