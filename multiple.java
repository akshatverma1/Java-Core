public class multiple {
    public static void main(String a[]) {
        derived d = new derived();
        d.functionone();
        d.functiontwo();
    }
}

interface base1 {
    void functionone();
}

interface base2 {
    void functiontwo();
}

class derived implements base1, base2 {
    public void functionone() {
        System.out.println("base1 function invoked");
    }

    public void functiontwo() {
        System.out.println("base2 function invoked");
    }
}