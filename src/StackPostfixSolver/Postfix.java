package StackPostfixSolver;

import java.util.Stack;

public class Postfix {
    private Stack<Double> stack;
    private String expression;

    public Postfix (String exp) {
        setExpression(exp);
    }

    public void setExpression(String exp) {
        expression = exp;
        stack = new Stack <Double>();
    }

    private double calc (double one, double two, char op) {
        if (op == '+') {
            return one + two;
        } else if (op == '-') {
            return one - two;
        } else if (op == '*') {
            return one * two;
        } else if (op == '/') {
            return one / two;
        }
        return 0.0;
    }

    public double solve() {
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' ||
                    expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                double x = stack.pop();
                double y = stack.pop();
                double z = calc(y, x, expression.charAt(i));
                stack.push(z);
            } else if (expression.charAt(i) == ' ') {
                continue;
            } else {
                int value = Character.getNumericValue(expression.charAt(i));
                stack.push((double) value);
            }
        }
        return stack.peek();
    }
}
