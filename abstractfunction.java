public class abstractfunction {
    public static void main(String[] args) {
        car c = new car();
        c.funct();
        abt a = new abt();
        a.fun();
        a.print();
    }
}

abstract class abs {
    void fun() {
        System.out.println("NORMAL FUNCTION");
    }

    abstract void print();
}

class abt extends abs {
    void print() {
        System.out.println("Abstract Function Invoked");
    }
}

interface lakshya {
    void funct();
}

class car implements lakshya {
    public void funct() {
        System.out.println("Interface Invoked");
    }
}