package JavaCollection.amaliy.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //1chi
        set.add("Apple");
        set.add("Banana");
        set.add("Peach");

        HashSet<String> cloned = (HashSet<String>) set.clone();
        System.out.println("Clone : "+cloned);
        //2chi
        ArrayList<String> list = new ArrayList<>(cloned);
        System.out.println("Converted : "+list);
        //3chi
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0){
            System.out.println(i+" "+list.get(i));}
        }

    }
}
