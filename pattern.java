public class pattern{
    public static int normal(){
        for (int i=1;i<=5;i++){
            //System.out.println("Akshat");
            for (int j = 1;j<=i;j++){
                System.out.print("Akshat ");    
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String arr[]) {
        normal();
        hollow(4, 5);   
    }
    public static void hollow(int row ,int column){
        for (int i = 1;i<=row;i++){
            for(int j= 1;j<=column;j++){
                if (i==1 ||j ==column || j == 1 ||i == row) {
                    System.out.print("#");
                }else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
