public class question02h {
    public static int akshat(int arrr[]) {
        int min = 0, total = 0;
        int plus = 0;
        for (int i = 0; i < (arrr.length - 1); i++) {
            if (arrr[i] < arrr[i + 1]) {
                min = arrr[i + 1] - arrr[i];
            } else {
                min = arrr[i] - arrr[i + 1];
            }
            total = total + min;
        }
        return total;
    }

    public static void main(String arr[]) {
        int arrr[] = { 5, 5, 3, 1, 4, 6, 5, 9, 9, 3, 15, 1 };
        System.out.println(akshat(arrr));
    }
}
