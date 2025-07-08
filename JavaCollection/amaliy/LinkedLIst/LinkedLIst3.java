package JavaCollection.amaliy.LinkedLIst;
import java.util.Collections;
import java.util.LinkedList;


public class LinkedLIst3 {
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
        list.remove(5);
        System.out.println(list);
        //2chi
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        //3chi
        list.removeAll(list);
        System.out.println(list);
    }


}
