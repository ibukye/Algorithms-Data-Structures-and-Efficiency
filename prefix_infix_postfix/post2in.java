package prefix_infix_postfix;

import java.util.Stack;

public class post2in {
    
    public static String postfix2infix(String s) {
        int i = 0;
        Stack<String> st = new Stack<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            // Operand
            if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || ('0' <= c && c <= '9')) {
                st.push(String.valueOf(c));
            }
            // Operator
            else {
                String b = st.pop();
                String a = st.pop();
                StringBuilder newEquation = new StringBuilder();
                newEquation.append("(");
                newEquation.append(a);
                newEquation.append(c);
                newEquation.append(b);
                newEquation.append(")");
                st.push(newEquation.toString());
            }
            i++;
        }
        return st.peek().toString();
    }


    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        String infix = postfix2infix(postfix);
        System.out.println(infix);
    }
}
