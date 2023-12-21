package MazeLab;

import java.util.Scanner;
public class mazeSolver
{
    private int[][] grid;
    private boolean[][] seen;
    public mazeSolver(int size)
    {
        grid= new int[size][size];
        int random;
        for(int row=0; row< size; row++)
        {
            for(int col=0; col< size; col++)
            {
                random=(int) (Math.random()*2);

                grid[row][col] = random;
            }
        }
    }
    public boolean findPath(int row, int col)
    {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid.length)
            return false;
        if(grid[row][col] == 0 || seen[row][col])
            return false;
        seen[row][col] = true;
        return (findPath(row-1, col) || findPath(row+1, col) || findPath(row, col-1)
                || findPath(row, col+1));
    }
    public void printMaze()
    {
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col <grid.length; col++)
            {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}
