package Stack;

import java.util.Stack;

public class reverse_stack_string {
    public static String reverse_string(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        StringBuilder strb= new StringBuilder("");
        while(!s.empty()){
            strb.append(s.pop());
        }
        
        return strb.toString();
    }
    public static void main(String arr[]){
        System.out.println(reverse_string("akshat"));
    }
}
