package ArrayList;

import java.util.*;

public class arraylist_basic {
    public static void main(String arr[]) {
        System.out.println("Akshatt");
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(90);
        list.add(213);
        list.add(100);
        list.add(2000);
        list.add(2000);
        list.add(2000);
        list.add(2000);
        list.add(2000);
        list.add(1, 9);
        System.out.println(list);

        // get Element Value
        System.out.println(list.get(2));

        // Remove Element Value
        list.remove(2);
        System.out.println(list);

        // set Value at Particular Index
        list.set(0, 20);
        System.out.println(list);

        // Contain
        System.out.println(list.contains(4));
        System.out.println(list.contains(8));
    }
}
