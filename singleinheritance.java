public class singleinheritance {
    public static void main(String[] args) {
        derived d = new derived();
        d.functionnnn();
    }
}

class base {
    String name = "akshat";

    void functionnnn() {
        System.out.println(name);
    }
}

class derived extends base {
    void printttt() {
        System.out.println(name);
    }
}