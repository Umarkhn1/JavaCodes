package JavaCollection.amaliy.LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedLIst1 {
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
        //2chi
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }
        //3chi
        System.out.println("Hajim : "+list.size());

    }
}
