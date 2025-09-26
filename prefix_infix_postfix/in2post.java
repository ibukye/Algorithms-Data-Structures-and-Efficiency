package prefix_infix_postfix;

import java.util.Stack;


public class in2post {
    // returns the priority as a number for operators
    public static int priority(String c) {
        int priority = -1;
        if (c.equals("^")) return 3;
        else if (c.equals("*") || c.equals("/")) return 2;
        else if (c.equals("+") || c.equals("-")) return 1;
        return priority;
    }

    // conversion function
    public static String infix2postfix(String s) {
        int i = 0;
        Stack<String> st = new Stack<>();
        String ans = "";

        while (i < s.length()) {
            char c = s.charAt(i);
            
            // Operand
            if (('A' <= c && c <= 'Z') || '0' <= c && c <= '9') {   // not "" -> '' for character
                ans += c;
            }

            // Opening bracket
            else if (c == '(') {
                st.push(String.valueOf(c));
            }
            
            // Closing bracket
            else if (c == ')') {
                while (!st.empty() && !st.peek().equals("(")) {
                    ans+=st.pop();
                    //st.pop();
                }
                if (!st.empty()) {
                    st.pop();   // for pop opening brackets
                }
            }

            // Operator
            else {
                String op = String.valueOf(c);
                //while (!st.empty() && priority(String.valueOf(c)) <= priority(st.peek())) {
                //    ans += st.pop();
                //}
                /*while (!st.empty() && !st.peek().equals("(")) {
                    int priorityOfOperator = priority(op);
                    int top = priority(st.peek());

                    // Left Associative Operator (+, -, *, /)
                    //if ((op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) && priorityOfOperator <= top) {
                    if (priorityOfOperator <= top && !op.equals("^")) {
                    ans+=st.pop();
                    }
                    // Right Associative Operator (^)
                    else if (priorityOfOperator < top && op.equals("^")) {
                        ans+=st.pop();
                    } else {
                        break;
                    }
                }*/
                while (!st.empty() && priority(op) < priority(st.peek())) { 
                    ans += st.pop();
                }
                st.push(op);
            }
            i++;
        }
        // After finished s, just add items in stack to the ans
        while (!st.empty()) {
            ans+=st.pop();
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        String infix = "A*(B+C)";
        String postfix = infix2postfix(infix);
        System.out.println(postfix);
    }    
}
