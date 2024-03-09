public class dsasheet22_trapped_water {
    public static int trapped(int height[]){
        int leftmax[] = new int[7];
        int rightmax[] = new int[7];
        for (int i=0;i<height.length;i++){
            for(int j=i;j<height.length;j++){
                if(rightmax[i]<=height[j]){
                    rightmax[i]=height[j];
                }
            }
        }
        int end = (rightmax.length-1);
        for(int k=end;k>=0;k--){
            for(int d=k;d>=0;d--){
                if(leftmax[k]<=height[d]){
                    leftmax[k]=height[d];
                }
            }
        }
        for(int i=0;i<height.length;i++){
            System.out.print(rightmax[i]);
        }
        System.out.print(" ");
        for(int i=0;i<height.length;i++){
            System.out.print(leftmax[i]);
        }
        System.out.println();   
        int mimum[] = new int[7];
        int r=0;
        for (int w=0;w<rightmax.length;w++){
            mimum[w]=Math.min(rightmax[w], leftmax[w]);
            int t = (mimum[w]-height[w]);
            if(t<0){
                t=0;
            }
            r=r+t;
        }
        return r;
    }
    public static void main(String a[]){
        int height[] = {4,2,0,6,3,2,5};
        int trapped_water_level = trapped(height); 
        System.out.println("It's the water are between buildings = "+trapped_water_level);
    }
}