public class runtimepolymorphsim {
    public static void main(String[] args) {
        runtime r = new runtime();
        r.functionone(2);
    }
}

class runtime {
    void functionone(int x) {
        System.out.println("interger type");
    }

    void functionone(char y) {
        System.out.println("Charater type");
    }
}
