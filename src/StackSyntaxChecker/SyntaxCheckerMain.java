package StackSyntaxChecker;

public class SyntaxCheckerMain {
    public static void main (String[] args) {
        String test = "(abc(*def)";
        SyntaxChecker checker = new SyntaxChecker(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "[{}]";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "{<html[value=4]*(12)>{$x}}";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "<{[()]}>";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "[one]<two>{three}(four)";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "car(cdr(a)(b)))";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "car(cdr(a)(b))";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }

        test = "car(cdr(a](b))";
        checker.setExpression(test);

        if (checker.checkExpression() == false) {
            System.out.println("The expression: " + test + " is wrong.");
        } else {
            System.out.println("The expression: " + test + " is right.");
        }
    }
}
