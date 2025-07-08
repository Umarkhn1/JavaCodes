package JavaCollection.amaliy.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1CHI
        list.add("Red");
        list.add("Black");
        list.add("Yellow");
        list.add("White");
        list.add("Green");
        list.add("Blue");
        list.add("Gray");
        System.out.println(list);

        //2CHI 2TA YOL BILAN
        System.out.println(list.reversed());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        String m = list.get(0);
        String s = list.get(6);
        System.out.println(m+" "+s);

        Collections.reverse(list);
        System.out.println(list);

    }
}
