package SaddlePointsLab;

public class Saddle {
    private static boolean biggestInRow (int myArr[][], int rowNum, int colNum) {
        int biggest = myArr[rowNum][colNum];
        int counter = 0;

        while (counter < myArr[rowNum].length) {
            if (biggest < myArr[rowNum][counter]) {
                return false;
            }
            counter++;
        }
        return true;
    }

    private static boolean smallestInCol (int myArr[][], int rowNum, int colNum) {

        int smallest = myArr[rowNum][colNum];
        int counter = 0;

        while (counter < myArr[colNum].length) {
            if (smallest > myArr[counter][colNum]) {
                return false;
            }
            counter++;
        }
        return true;
    }

    public static void main (String[] args) {

        int[][] myArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        boolean foundSaddle = false;

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                if ((biggestInRow(myArr, i, j) == true) && (smallestInCol(myArr, i, j) == true)) {
                    System.out.println("The saddle point is: " + i + ", " + j + ".");
                }
            }
        }

        if (!foundSaddle) {
            System.out.println("There are no saddle points.");
        }
    }
}
