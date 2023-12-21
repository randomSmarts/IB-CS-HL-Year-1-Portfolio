package StackPostfixSolver;

public class PostfixSolverMain {
    public static void main (String[] args) {
        String test = "2 7 + 1 2 + +";

        Postfix tester = new Postfix(test);

        System.out.println(test + " = " + tester.solve());

        test = "1 2 3 4 + + +";
        tester.setExpression(test);
        System.out.println(test + " = " + tester.solve());

        test = "9 3 * 8 / 4 +";
        tester.setExpression(test);
        System.out.println(test + " = " + tester.solve());

        test = "3 3 + 7 * 9 2 / +";
        tester.setExpression(test);
        System.out.println(test + " = " + tester.solve());

        test = "9 3 / 2 * 7 9 * + 4 -";
        tester.setExpression(test);
        System.out.println(test + " = " + tester.solve());

        test = "5 5 + 2 * 4 / 9 +";
        tester.setExpression(test);
        System.out.println(test + " = " + tester.solve());
    }
}
