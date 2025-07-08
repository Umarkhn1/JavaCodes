package JavaCollection.amaliy.Arraylist;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayLIst2 {
    public static void main(String[] args) {
      //1chi
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Black");
        list.add("Yellow");
        list.add("White");
        list.add("Green");
        list.add("Blue");
        list.add("Gray");

        System.out.println(list);

        if(list.contains("bb")){
            System.out.println("Yes");
        }
        else System.out.println("No");

        //2chi
        ArrayList<String> list1 = new ArrayList<>(list);

        System.out.println(list1);


//3chi
        Collections.shuffle(list);
        System.out.println(list);
    }
}
