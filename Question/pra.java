package Question;

import java.util.*;

public class pra {
    public static void main(String arr[]) {
        int mid = 0;
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3 };
        int[] arrayy = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            arrayy[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arrayy[nums1.length + i] = nums2[i];
        }
        for (int i = 0; i < arrayy.length; i++) {
            for (int j = i + 1; j < arrayy.length; j++) {
                if (arrayy[i] > arrayy[j]) {
                    int temp = arrayy[i];
                    arrayy[i] = arrayy[j];
                    arrayy[j] = temp;
                }
            }
        }
        if ((arrayy.length) % 2 == 0) {
            mid = (arrayy.length / 2) - 1;
            float midvalue = Float.valueOf((arrayy[mid] + arrayy[mid + 1]));
            midvalue = midvalue / 2;
            System.out.println(midvalue);
        } else {

            mid = arrayy[(arrayy.length / 2)];
            // return mid;
            System.out.println(Float.valueOf(mid));
        }
        // return mid;
    }
}