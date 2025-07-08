package JavaCollection.amaliy.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Black");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Black");


        if(list.equals(list1)){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
