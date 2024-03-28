import javax.swing.text.StyledEditorKit;

public class bitmanipulation {
    public static void main(String arr[]) {
        System.out.println("Even Number");
        for (int i = 0; i <= 10; i++) {
            int u = (i & 1);
            if (u == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("Odd Number");
        for (int i = 0; i <= 10; i++) {
            int u = (i & 1);
            if (!(u == 0)) {
                System.out.print(i + " ");
            }

        }
    }
}