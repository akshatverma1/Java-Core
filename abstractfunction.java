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
        System.out.println("SciLab");
        System.out.println("SciLab");
        System.out.println("scc22");
        System.out.println("Command Line");
        System.out.println("MySql");
        System.out.println("Mysql");
        System.out.println("fdsfsf");
        System.out.println("fdsfsf");
        System.out.println("fdsfsf");
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