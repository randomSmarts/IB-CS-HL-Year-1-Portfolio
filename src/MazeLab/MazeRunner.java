package MazeLab;

import java.util.Scanner;

class mazeSolverRunner
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = myScanner.nextInt();
        mazeSolver maze = new mazeSolver(size);
        maze.printMaze();
        if(maze.findPath(0,0))
            System.out.println("Exit Found");
        else
            System.out.println("Exit Not Found");
        myScanner.close();
    }
}


