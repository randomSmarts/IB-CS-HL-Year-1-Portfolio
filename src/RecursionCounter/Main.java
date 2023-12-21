package RecursionCounter;

public class Main {
    public static void main (String[] args) {
        AtCounter matrix = new AtCounter();
        System.out.println(matrix);
        System.out.println("At Chain at 0, 0 = " + matrix.countAs(0,0));
        System.out.println("\n");

        AtCounter matrix2 = new AtCounter();
        System.out.println(matrix2);
        System.out.println("At Chain at 5, 5 = " + matrix2.countAs(5,5));
        System.out.println("\n");

        AtCounter matrix3 = new AtCounter();
        System.out.println(matrix3);
        System.out.println("At Chain at 9, 9 = " + matrix3.countAs(9,9));
        System.out.println("\n");

        AtCounter matrix4 = new AtCounter();
        System.out.println(matrix4);
        System.out.println("At Chain at 3, 5 = " + matrix4.countAs(3,5));
        System.out.println("\n");

        AtCounter matrix5 = new AtCounter();
        System.out.println(matrix5);
        System.out.println("At Chain at 5, 7 = " + matrix5.countAs(5,7));
        System.out.println("\n");
    }
}
