public class Rearrange_Array_Elements_by_Sign {
    public static void main(String arr[]) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        System.out.println(rearrange(nums));
    }

    public static int[] rearrange(int[] nums) {
        int[] nums2 = new int[nums.length];
        int pos[] = new int[nums.length / 2];
        int neg[] = new int[nums.length / 2];
        int posCount = 0, negCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[posCount] = nums[i];
                posCount++;
            } else if (nums[i] < 0) {
                neg[negCount] = nums[i];
                negCount++;
            }
        }
        boolean bool = true;
        int posAlerator = 0;
        int negAlerator = 0;
        for (int i = 0; i < nums.length; i++) {
            if (bool) {
                nums2[i] = pos[posAlerator];
                posAlerator++;
                bool = false;
            } else {
                nums2[i] = neg[negAlerator];
                negAlerator++;
                bool = true;
            }
        }
        for (int u : nums2) {
            System.out.print(u + " ");
        }
        // int startIndex = 0;
        // int endIndex = startIndex+1;
        // while (startIndex<=nums.length-2) {
        // if(nums[startIndex]>0){
        // if(nums[endIndex]<0){
        // startIndex+=2;
        // endIndex = startIndex+1;
        // }else{
        // endIndex++;
        // }
        // }
        // }
        return nums;
    }
}
