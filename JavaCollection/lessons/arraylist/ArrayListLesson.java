package JavaCollection.lessons.arraylist;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Banana");
//        list.add("Apple");
//        list.add("Limon");
//        list.add("Pear");
//        list.remove("Pear");
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(2));
//        }

//        for(String a : list){
//            System.out.println(a);
//        }

//        list.forEach(s -> {
//            System.out.println(s);
//        });
//
//        Collections.sort(list);
//        System.out.println(list);

        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("Umar",1);
        Student student1 = new Student("Tom",2);
        Student student2 = new Student("Don",3);
        list.add(student);
        list.add(student1);
        list.add(student2);

        list.forEach(item -> {
            System.out.println(item.getId());
            System.out.println(item.getName());

        });

    }
}
