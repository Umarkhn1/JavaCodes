package JavaCollection.amaliy.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //1chi
        set.add("Apple");
        set.add("Banana");
        set.add("Peach");
        System.out.println(set);
        //2chi
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String fruits = iterator.next();
            System.out.println(fruits);
        }
        //3chi
        TreeSet<String>set1 = new TreeSet<>(set);
        System.out.println(set1.descendingSet());
    }
}
