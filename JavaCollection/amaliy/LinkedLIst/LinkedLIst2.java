package JavaCollection.amaliy.LinkedLIst;

import java.util.LinkedList;

public class LinkedLIst2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //1chi
        list.add("BMW");
        list.add("Bugatti");
        list.add("Lamborghini");
        list.add("Ferrari");
        list.add("Ford");
        list.add("Audi");
        list.add("Mercedes");

        System.out.println(list.reversed());
        //2chi
        list.add(0,"Mustang");
        list.add(7,"Tesla");
        System.out.println(list);
        //3chi
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
