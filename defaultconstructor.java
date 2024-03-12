public class defaultconstructor {
    public static void main(String[] args) {
        akshat a = new akshat();
        akshat d = new akshat(2);
        a.function();
    }
}
class akshat{
    public String name ="AKSHAT";
    public void function(){
        System.out.println(name);
    }
    akshat(){
        System.out.println("Constructor invoked");
    }
    akshat(int a){
        System.out.println("Paramized Constructor invoked");
    }
}