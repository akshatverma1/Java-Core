// Question 1 :
// Monotonic ArrayList (EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
// An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
// Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
// Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

import java.util.ArrayList;

public class question1 {
    public static boolean monotonic(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(10);
        System.out.println(list);
        System.out.println(monotonic(list));
    }
}
