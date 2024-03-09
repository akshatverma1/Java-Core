public class kadanes {
    public static void kadane(int arrr[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arrr.length;i++){
            currentsum = currentsum +arrr[i];
            if (currentsum<0) {
                currentsum=0;
            }
            maxsum = Math.max(maxsum, currentsum);
        }
        System.out.println("This is Your Valuable Output = "+ maxsum);
    }

    public static void updatekadane(int arrru[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int min=0;
        for(int i=0;i<arrru.length;i++){
            currentsum = currentsum +arrru[i];
            maxsum = Math.max(maxsum, currentsum);
            if ((min>=arrru[i])){
                min=arrru[i];   
            }
        }
        System.out.println("This is Your Valuable update Output = "+ min);
    }
    public static void main(String[] args) {
        int arrr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arrr);
        int arrru[] = {-2,-3,-4,-1,-2,-1,-5,-22};
        updatekadane(arrru);
    }
}
