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
                // if +, - then need ()
                if (c=='+' || c=='-') {
                    String b = st.pop();
                    String a = st.pop();
                    StringBuilder newEquation = new StringBuilder();
                    newEquation.append("(");
                    newEquation.append(a);
                    newEquation.append(c);
                    newEquation.append(b);
                    newEquation.append(")");
                    st.push(newEquation.toString());
                } else {
                    String b = st.pop();
                    String a = st.pop();
                    StringBuilder newEquation = new StringBuilder();
                    newEquation.append(a);
                    newEquation.append(c);
                    newEquation.append(b);
                    st.push(newEquation.toString());
                }
                
            }
            i++;
        }
        return st.peek().toString();
    }

    public static String removeBrackets(String s) {
        if (s.startsWith("(") && s.endsWith(")")) {
            return s.substring(1, s.length()-1);
        }
        return s;
    }


    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        String infix = postfix2infix(postfix);
        //System.out.println(infix);
        System.out.println(removeBrackets(infix));
    }
}
