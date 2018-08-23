package Data_Structures;

import java.util.Stack;

public class Stack1 {
    public static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else if (c==')' || c==']' || c=='}'){
                if (st.peek()=='(' && c==')' || st.peek()=='[' && c==']' || st.peek()=='{' && c=='}') {
                    st.pop();
                }
                else return false;
            }      
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({}[][]({[]}))";
        Stack<Character> st = new Stack<>();
        System.out.println(check(s)?"correct":"incorrect");
    }
}
