package StackSyntaxChecker;

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker {
    private String expression;
    private Stack<Character> symbols;

    public SyntaxChecker(String s) {
        setExpression(s);
    }

    public void setExpression(String s) {
        expression = s;
        symbols = new Stack<Character>();
    }

    public boolean checkExpression() {
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i)
                    == '<' ||
                    expression.charAt(i) == '[') {
                symbols.push(expression.charAt(i));
            } else if (expression.charAt(i) == '}' || expression.charAt(i) == ')' || expression.charAt(i)
                    == '>' || expression.charAt(i) == ']') {
                if (symbols.isEmpty()) {
                    return false;
                }
                char sym = symbols.pop();

                if ((expression.charAt(i) == '}' && sym != '{') || (expression.charAt(i) == ')' &&
                        sym != '<')) {
                    return false;
                }
            }
        }
        if (symbols.isEmpty() == false) {
            return false;
        }
        return true;
    }

    public String toString() {
        String retval = "";
        return symbols.toString();
    }
}
