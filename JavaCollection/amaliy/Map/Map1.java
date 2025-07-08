package JavaCollection.amaliy.Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
       //1chi
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"Green");
        //2chi
        for (Map.Entry<Integer,String> m :map.entrySet()){
            System.out.println("Key : "+m.getKey()+"Value : "+m.getValue());
        }
        //3chi
        System.out.println(map.size());
    }
}
