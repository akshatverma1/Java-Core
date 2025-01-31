import java.util.*;

public class L15 {
    public static void main(String arr[]) {
        int arrayy[] = { -1, 0, 1, 2, -1, -4 };

        ArrayList<String> arrr = new ArrayList<>();

        for (int i = 0; i < arrayy.length; i++) {
            for (int j = i + 1; j < arrayy.length; j++) {
                for (int k = j + 1; k < arrayy.length; k++) {
                    if (arrayy[i] + arrayy[j] + arrayy[k] == 0) {
                        System.out.println(arrayy[i] + " " + arrayy[j] + " " + arrayy[k]);

                        arrr.add("[" + arrayy[i] + "," + arrayy[j] + "," + arrayy[k] + "]");
                    }
                }
            }
        }
        System.out.println(arrr);
        // System.out.println(Core());
    }

    public static int Core() {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> arrr = new ArrayList<>();
        int y = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (y == 2) {
                        return 0;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int q = 0;
                        if (arrr.get(q) == arrr.get(q + 1)) {
                            System.err.println("Same");
                            return 0;
                        }

                        arrr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        y = y + 1;

                    }
                }
            }
        }
        return 0;
    }
}