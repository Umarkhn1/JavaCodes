package JavaCollection.amaliy.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Map3 {
    public static void main(String[] args) {
        //1chi
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"Green");

        HashMap<Integer,String>cloned = (HashMap<Integer, String>) map.clone();
        //2chi
        ArrayList<String >list=new ArrayList<>(cloned.values());
        System.out.println(list);
    }
}
