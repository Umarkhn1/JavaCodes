package JavaCollection.amaliy.Arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1chi
        list.add("Red");
        list.add("Black");
        list.add("Yellow");
        list.add("White");
        list.add("Green");
        list.add("Blue");
        list.add("Gray");

        System.out.println(list);
        //2chi
        list.set(0,"Pink");
        list.forEach(s -> {
            System.out.println(s);
        });
        //3chi
        System.out.println(list.size());
    }
}
