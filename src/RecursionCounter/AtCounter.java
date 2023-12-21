package RecursionCounter;

public class AtCounter {
    private String[][] atMat = new String[10][10];

    public AtCounter() {


        for (int i = 0; i < atMat.length; i++) {
            for (int j = 0; j < atMat[i].length; j++) {
                if ((int)(Math.random() * 2) == 0) {
                    atMat[i][j] = "0";
                } else {
                    atMat[i][j] = "-";
                }
            }
        }
    }

    public int countAs(int r, int c) {
        if (r < 0 || r >= atMat.length || c < 0 || c >= atMat[r].length || !atMat[r][c].equals("0")) {
            return 0;
        }

        atMat[r][c] = "-";

        return 1 + countAs(r, c + 1) + countAs(r+1, c) + countAs(r-1, c) + countAs(r, c-1);
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < atMat.length; i++) {
            for (int j = 0; j < atMat[i].length; j++) {
                output += atMat[i][j] + " ";
            }
            output += "\n";

        }
        return output;
    }
}
