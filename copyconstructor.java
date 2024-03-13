public class copyconstructor {
    public static void main(String arr[]) {
        copy s1 = new copy();
        s1.name = "akshat";
        s1.rollno = 1;
        copy s2 = new copy(s1);
    }
}

class copy {
    String name;
    int rollno;

    copy() {
        System.out.println("Default Constructor Invoked");
    }

    copy(copy s1) {
        String ww = s1.name;
        this.rollno = s1.rollno;
        System.out.println(ww);
        System.out.println(this.rollno);
    }
}