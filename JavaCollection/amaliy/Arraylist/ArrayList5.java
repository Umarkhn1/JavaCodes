package JavaCollection.amaliy.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
       //1CHI

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Black");
        list.add("Yellow");
        list.add("White");
        list.add("Green");
        list.add("Blue");
        list.add("Gray");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("R");
        list1.add("Bl");
        list1.add("Ye");
        list1.add("Wh");
        list1.add("Gr");
        list1.add("Bl");
        list1.add("Gr");


        int index1 = list.indexOf("Red");
        int index2 = list.indexOf("White");

        Collections.swap(list,index1,index2);
        System.out.println(list);

        //2CHI
        list.addAll(list1);
        System.out.println(list);

        /// ///////////////////////////////////////////////////////////
           ArrayList<String> list3 = new ArrayList<>(9);
           list3.add("Red");
           list3.add("Black");
           list3.add("Yellow");
        if (list3.size() <=3) {
            System.out.println(list3);

        } else {
            System.out.println("Больше 3 элементов добавить нельзя!");
        }




    }
}
