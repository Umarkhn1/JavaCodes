package JavaCollection.amaliy.LinkedLIst;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList4 {
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

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Cobalt");
        list1.add("Spark");
        list1.add("Gentra");

        list.addAll(list1);
        System.out.println(list);
        //2chi
        LinkedList<String> listCopy = new LinkedList<>(list);
        System.out.println(listCopy);
        //3chi
        list.removeFirst();
        System.out.println(list);
    }


}
