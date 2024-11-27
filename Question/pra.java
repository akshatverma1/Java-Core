package Question;

public class pra {
    public static void main(String arr[]) {
        int arrr[] = { 1, 3, 4, 5, 7, 5 };
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] > arrr[i + 1]) {
                arrr[i] = arrr[i + 1];
            }
        }
        System.out.println(arrr);
    }
}
