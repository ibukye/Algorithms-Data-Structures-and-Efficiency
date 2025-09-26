package prefix_infix_postfix;

import java.util.Stack;

public class in2pre {

    // reverse function
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    // reverse brackets
    public static String reverseBrackets(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                result.append(')');
            } else if (c == ')') {
                result.append('(');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String infix = "(A+B)*C-D+F";
        String reversedString = reverse(infix);
        String reversedBrackets = reverseBrackets(reversedString);
        String prefix = reverse(in2post.infix2postfix(reversedBrackets));
        System.out.println(prefix);
    }
}
