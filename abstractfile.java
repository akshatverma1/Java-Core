import java.util.*;

public class abstractfile {

    public static void main(String arr[]) {
        akshatone g = new akshatone();
        g.abss();
        abs h = new abs();
        h.akshat();
    }
}

abstract class abs {
    void akshat() {
        System.out.println("akshat");
    }

    abstract void abss();
}

class akshatone extends abs {
    void fff() {
        System.out.println("akshattt");
    }

    void abss() {
        System.out.println("function");
    }
}