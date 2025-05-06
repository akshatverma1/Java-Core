public class sellandbuy {
    public static void main(String arr[]) {
        int stock[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(profit(stock));
    }

    public static int profit(int stock[]) {
        int buying = stock[0];
        int maxProfit = 0;
        for (int i = 1; i < stock.length; i++) {
            if (buying < stock[i]) {
                int profit = stock[i] - buying;
                if (maxProfit <= profit) {
                    maxProfit = profit;
                }
            } else
                buying = stock[i];
        }
        return maxProfit;
    }
}
