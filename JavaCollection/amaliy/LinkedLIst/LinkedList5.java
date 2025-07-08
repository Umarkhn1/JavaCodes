package JavaCollection.amaliy.LinkedLIst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList5 {
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
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        //2chi
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
        //3chi
        Collections.sort(list);
        System.out.println(list);

        String searchElement = "Ferrari";
        if(list.contains(searchElement)){
            System.out.println("True");
        }
        else System.out.println("False");

    }
}
