public class p13friendspairingproblem {
    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fb1 = pairing(n - 1);
        int fb2 = pairing(n - 2);
        int total = fb1 + fb1 * fb2;
        return total;
    }

    public static void main(String arr[]) {
        System.out.println(pairing(3));
    }
}
