package prefix_infix_postfix;

import java.util.Stack;

public class post2pre {

    // Discriminate Operand
    public static boolean isOperand(char c) {
        return (('A'<=c && c<='Z') || ('a'<=c && c<='z') || ('0'<=c && c<='9')); 
    }

    public static String postfix2prefix(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            
            // Operand
            if (isOperand(c)) {
                st.push(String.valueOf(c));
            }
            // Operator
            else {
                StringBuilder newEquation = new StringBuilder();
                String b = st.pop();
                String a = st.pop();
                newEquation.append(c);
                newEquation.append(a);
                newEquation.append(b);
                st.push(newEquation.toString());
            }
            i++;
        }
        return st.peek().toString();
    }


    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        String prefix = postfix2prefix(postfix);
        System.out.println(prefix);
    }
}
