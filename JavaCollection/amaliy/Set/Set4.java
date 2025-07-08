package JavaCollection.amaliy.Set;

import java.util.*;

public class Set4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //1chi
        set.add("Apple");
        set.add("Banana");
        set.add("Peach");

        HashSet<String> sett = new HashSet<>();
        sett.add("Apple");
        sett.add("Banana");
        sett.add("Watermelon");
        sett.retainAll(set);

        ArrayList<String> list = new ArrayList<>(sett);
        System.out.println(sett);
        //2chi

                Set<Integer> set1 = new HashSet<>();
                Set<Integer> set2 = new HashSet<>();
                set1.add(1);
                set1.add(2);
                set1.add(3);
                set2.add(3);
                set2.add(4);
                set2.add(5);

                List<Integer> result = new ArrayList<>();

                for (int i : set1)
                    if (!set2.contains(i)) result.add(i);

                for (int i : set2)
                    if (!set1.contains(i)) result.add(i);

                System.out.println(result);


            }
        }




