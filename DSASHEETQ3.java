//Question3 - Write a program to findLength of aStringusing Recursion. 
public class DSASHEETQ3 {
    public static int findlenghtstr(String OriginalString, int n) {
        if (OriginalString.length() == n) {
            return n;
        }
        int x = findlenghtstr(OriginalString, n + 1);
        return x;
    }

    public static void main(String a[]) {
        String str = "akshat";
        System.out.println(findlenghtstr(str, 0));

    }
}
