public class Oop {
    public static void main(String[] args) {
        bank a = new bank();
        a.name="akshat";
        a.show();
    }
}
class bank{
        private int password;
        public String name;
        public int mobile;
        void show(){
        System.out.println(name+" "+mobile);
    }
}