import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swap {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
        System.out.println("Akshat");
        System.out.println("Verma");
        System.out.println("Verma");
    }

    public static void main(String arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(323);
        list.add(2345);
        list.add(124);
        list.add(879);
        list.add(32);
        list.add(800);
        list.add(7989);
        list.add(8000);
        list.add(54765);
        list.add(786);
        list.add(56);
        list.add(7666);
        list.add(888);
        list.add(7878);
        list.add(5555);
        System.out.println(list);
        swap(list, 1, 2);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
