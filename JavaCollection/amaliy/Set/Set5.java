package JavaCollection.amaliy.Set;

import java.util.*;

public class Set5 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        List<Integer> result = new ArrayList<>();

        for (int i : set1)
            if (!set2.contains(i)) result.add(i);

        System.out.println(result);

        //2chi
        result.clear();
        for (int i : set2)
            if (!set1.contains(i)) result.add(i);
        System.out.println(result);

         //3chi
        set1.addAll(set2);
        System.out.println(set1);
        ArrayList<Integer> list = new ArrayList<>(set1);

        for (int number : list) {
            if(number%2==0){
                System.out.println("Четные "+number);
            }
        }
    }
}
