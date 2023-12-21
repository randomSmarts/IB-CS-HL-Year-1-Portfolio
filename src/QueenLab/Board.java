package QueenLab;

public class Board {
    private Square[][] board;

    public Board (int xSize, int ySize) {
        board = new Square[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                board[i][j] = new Square(i, j, 0);
            }
        }
    }

    public void setQueen (int x, int y) {
        board[x][y].setQueen();
    }

    public boolean isQueen (int x, int y) {
        if (board[x][y].getVal() == 1) {
            return true;
        }
        return false;
    }

    public Square getSquare (int x, int y) {
        return board[x][y];
    }
}
