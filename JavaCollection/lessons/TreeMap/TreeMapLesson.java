package JavaCollection.lessons.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLesson {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(2,"BMW");
        map.put(1,"Mercedes");
        map.put(4,"Audi");
        map.put(5,null);
        map.put(3,null);

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.size());





    }
}
