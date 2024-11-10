import java.util.*;

public class abstractfile {
    public static void main(String arr[]) {
        akshatone g = new akshatone();
        g.abss();
    }
}

class abs {
    void akshat() {
        System.out.println("akshat");
    }

    void abss() {
    };
}

class abstwo {
    void akshat() {
    }

    void date(int x) {

    }
}

class akshatone extends abs {
    void fff() {
        System.out.println("akshattt");
    }

    void abss() {
        System.out.println("Akshat");
    }
}