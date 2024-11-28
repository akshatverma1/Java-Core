package Question;

public class pra2 {
    public static void main(String arr[]) {
        int i = -121;
        String str = String.valueOf(i);
        for (int j = str.length() - 1; j >= 0; j--) {
            System.out.print(str.charAt(j));
        }
    }
}
