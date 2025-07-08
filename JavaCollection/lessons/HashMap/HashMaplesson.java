package JavaCollection.lessons.HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMaplesson {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(null,"peach");

        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+ " = "+m.getValue());
        }
    }

}
