package QueenLab;

class Main {
    private static void runTest(int x1, int y1, int x2, int y2){

        Board chessboard = new Board(8,8);

        Square queen1 = new Square(x1, y1, 0);
        Square queen2 = new Square(x2, y2, 0 );

        if (queen1.getRow() == queen2.getRow()) {
            System.out.println("They can attack each other because they are on the same row.");
        } else if (queen1.getCol() == queen2.getCol()) {
            System.out.println("They can attack each other because they are on the same column.");
        } else if (Math.abs(queen1.getCol() - queen2.getCol()) == Math.abs(queen1.getRow() - queen2.getRow())) {
            System.out.println("They can attack each other because they are on the same diagonal line.");
        } else {
            System.out.println("They cannot attack each other.");
        }
    }

    public static void main(String[] args) {
        runTest(1,3,1,7); // The queens are on the same row.
        runTest(2,3,4,3); // The queens are on the same column.
        runTest(2,3,4,5); // The queens are on the same diagonal line.
        runTest(2,3,4,1); // The queens are on the same diagonal line.
        runTest(4,5,2,3); // The queens are on the same diagonal line.
        runTest(7,3,4,5); // The queens cannot attack each other.
    }
}