package prefix_infix_postfix;

import java.util.Stack;

public class pre2post {

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static boolean isOperand(char c) {
        return (('A'<=c && c<='Z') || ('a'<=c && c<='z') || ('0'<=c && c<='9')); 
    }

    public static String prefix2postfix(String s) {
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
                String a = st.pop();
                String b = st.pop();
                newEquation.append(a);
                newEquation.append(b);
                newEquation.append(String.valueOf(c));
                st.push(newEquation.toString());
            }
            i++;
        }
        return st.peek().toString();
    }

    public static void main(String[] args) {
        String prefix = "/-AB*+DEF";
        String reversedPrefix = reverseString(prefix);
        String postfix = prefix2postfix(reversedPrefix);
        System.out.println(postfix);
    }
}
