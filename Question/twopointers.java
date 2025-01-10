class twopointers{
    public static void main(String arr[]){
        int array[] = {1,2,3,4,5,6,7,8};
        System.out.println(twopointer(array));
    }



    public static int twopointer(int array[]){
        int left = 0;
        int right = array.length-1;
        int target = 8;
        while(left<right){
            int summ = array[left]+array[right];
            if(summ==target){
                return target;
            }
            if(summ>target){
                right--;
            }else {
                left++;
            }
        }
        return 0;
    }
}