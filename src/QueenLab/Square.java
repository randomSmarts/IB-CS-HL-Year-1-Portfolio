package QueenLab;

public class Square {
    private int x;
    private int y;
    private int val;

    public Square (int xSet, int ySet, int valSet) {
        x = xSet;
        y = ySet;
        val = valSet;
    }

    public int getVal() {
        return val;
    }

    public void setQueen() {
        val = 1;
    }

    public int getRow() {
        return x;
    }

    public int getCol() {
        return y;
    }
}
