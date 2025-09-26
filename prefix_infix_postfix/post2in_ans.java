package prefix_infix_postfix;

import java.util.Stack;

public class post2in_ans {

    // 優先順位を返す
    public static int priority(char c) {
        switch (c) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    // Postfix → Infix
    public static String postfix2infix(String s) {
        Stack<String> expr = new Stack<>();
        Stack<Integer> prio = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // オペランド
            if (Character.isLetterOrDigit(c)) {
                expr.push(String.valueOf(c));
                prio.push(100); // オペランドは最優先
            }
            // 演算子
            else {
                String b = expr.pop();
                String a = expr.pop();
                int pb = prio.pop();
                int pa = prio.pop();

                int pc = priority(c);

                // 括弧付けルール
                if (pa < pc) a = "(" + a + ")";
                if (pb <= pc) b = "(" + b + ")";

                expr.push(a + c + b);
                prio.push(pc);
            }
        }
        return expr.peek();
    }

    public static void main(String[] args) {
        String postfix = "AB-DE+F*/";
        String infix = postfix2infix(postfix);
        System.out.println(infix); // (A-B)*(D+E)/F
    }
}
