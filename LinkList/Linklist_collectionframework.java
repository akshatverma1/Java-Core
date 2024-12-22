package LinkList;

import java.util.*;

public class Linklist_collectionframework {
    public static void main(String arr[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Akshat");
        list.addLast("Verma");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.removeFirst();
        System.out.println(list);
    }
}
