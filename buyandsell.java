public class buyandsell {
    public static void stock(int prices[]){
        int buying=prices[0];
        int profit;
        int max=0;
        for (int i=0;i<prices.length;i++){
            int selling=prices[i];
            for(int j=i;j>=0;j--){
                if (buying>=prices[j]) {
                    buying=prices[j];
                }  
            }
            profit = (selling-buying);
            if(max<=profit){
                max=profit;
            }
            buying=prices[0];
        }   
            System.out.println(max);     
    }
    public static void main(String arr[]){
        int prices[] = {7,1,5,3,6,4};    
        stock(prices);
    }
}
