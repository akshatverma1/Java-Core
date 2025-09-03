package ArrayList;

import java.util.*;

public class Arraya {
    public static void main(String arr[]) {
        ArrayList<Integer> List = new ArrayList<>();
        // List.add(1);
        // List.add(2);
        // List.add(3);
        // List.add(4);
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(5);
        List1.add(6);
        List1.add(7);
        List1.add(8);
        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(9);
        List2.add(10);
        List2.add(11);
        List2.add(12);
        ArrayList<ArrayList<Integer>> FullList = new ArrayList<>();
        FullList.add(List);
        FullList.add(List1);
        FullList.add(List2);
        System.out.println(FullList);
    }
}
