package JavaCollection.lessons.linkedlist;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("You");
        list.add("Are");
        list.add("Gay");


        list.forEach(s -> {
            System.out.println(s);
        });

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
