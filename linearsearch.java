public class linearsearch {
    public static int akshat(int arra[]){
        for(int i=0;i<10;i++){
            //System.out.println(arra[i]);
            if(arra[i]==447){
                System.out.println("Mila gaya");
                return i;
            }
        }
        System.out.println("Nhi Mila");
        return 0;
    }
    public static void main(String a[]){
        int arra[] = {20,13,22,34,47,54,68,79,80,99};
        int y = akshat(arra);
        if (y==0){
            System.err.println("False");
        }else{
        System.out.println(y);}
        }
}
