import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swap {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(323);
        list.add(2345);
        list.add(124);
        list.add(879);
        System.out.println(list);
        swap(list, 1, 2);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
