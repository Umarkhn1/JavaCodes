package JavaCollection.lessons.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetLesson {


    public static void main(String[] args) {
        LinkedHashSet<String> set =new LinkedHashSet<>();

        set.add("BMW");
        set.add("Mercedes");
        set.add("Camaro");
        set.add("Camaro");
//        System.out.println(set);
        for(String str:set){
            System.out.println(str);
        }
    }
}
