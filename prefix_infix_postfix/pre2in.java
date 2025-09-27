package prefix_infix_postfix;

public class pre2in {
    public static void main(String[] args) {
        String prefix = "*+PQ-MN";
        String reversedString = in2pre.reverse(prefix);
        String infix = post2in.postfix2infix(reversedString);
        String reversedInfix = in2pre.reverse(infix);
        String reverseBracketsInfix = in2pre.reverseBrackets(reversedInfix);
        System.out.println(reverseBracketsInfix);
    }    
}
