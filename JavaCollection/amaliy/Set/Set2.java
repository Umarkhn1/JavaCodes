package JavaCollection.amaliy.Set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //1chi
        set.add("Apple");
        set.add("Banana");
        set.add("Peach");

        System.out.println(set.size());
        //2chi
        if(set.size()<=0){
            System.out.println("Bosh");
        }
        else System.out.println("Boshmas");

        //3chi
        set.removeAll(set);
        System.out.println(set);


    }
}
