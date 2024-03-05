public class largestnumber {
    public static void akshat(int man[]){
        int lar=0;
        
        for(int i=1;i<man.length;i++){
            //System.out.println(man[i]);
            if (lar<=man[i]){
                lar=man[i];
            }
            //else{
              //  System.out.println(i);
            //}
        }
       System.out.println(lar);
        
    }
    public static void main(String[] args) {
        int man[]={1,2,3,8,3,5,32,6,3};
        akshat(man);
    }
}