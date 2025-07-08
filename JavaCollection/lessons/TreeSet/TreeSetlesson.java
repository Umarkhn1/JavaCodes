package JavaCollection.lessons.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetlesson {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(44);
        set.add(32);
        set.add(-2);
        set.add(0);
        set.add(-5);
        System.out.println(set);

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW3");
        hashSet.add("Mercedes");
        hashSet.add("Camaro");
        hashSet.add("Camaro");
        System.out.println(hashSet);
//
//        TreeSet <String> tset = new TreeSet<>(hashSet);
//        System.out.println(tset);
//        System.out.println(tset.descendingSet()); //ubivaniye
//    }
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
