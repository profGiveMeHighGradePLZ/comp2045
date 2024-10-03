import java.io.File;
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) throws Exception {
        new Maze().runApp();
    }

    //you are not allowed to modify this method
    void runApp() throws Exception {
        char[][] maze = readMaze(filePicking());
        int[] start = findStartPosition(maze); //starting point of the maze
        int r = start[0]; //current row no.
        int c = start[1]; //current column no.
        printMaze(maze, r, c);
        System.out.println("* is your current position.");
        System.out.println("Use a,s,d,w (a:left, s:down, d:right, w:up) to move destination (D).");

        while(!isWin(maze, r, c)){
            char m = getMove();
            int[] newPos = findNewPosition(r, c, m);
            int newR = newPos[0]; //new row no. after move
            int newC = newPos[1]; //new column no. after move
            if (isValidMove(maze, newR, newC)) {
                if (maze[r][c] != 'S') {
                    maze[r][c] = '.';
                }
                r = newR; //update the current row no.
                c = newC; //update the current column no.
            }
            System.out.println();
            printMaze(maze, r, c);
        }
    }

    //you are not allowed to modify this method
    String filePicking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = sc.nextLine();
        return filename;
    }

    //you are not allowed to modify this method
    char[][] readMaze(String filename) throws Exception {
        File inputFile = new File(filename);
        if (!inputFile.exists()) {
            System.out.println("The file " + filename + " is not found.");
            System.exit(0);
        }
        Scanner in = new Scanner(inputFile);

        int rows = in.nextInt();
        int cols = in.nextInt();
        in.nextLine(); //absorb the newline character

        char[][] maze = new char[rows][cols];

        for (int i = 0; i < maze.length; i++) {
            String line = in.nextLine();
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = line.charAt(j);
            }
        }

        in.close();
        return maze;
    }

    void printMaze(char[][] maze, int r, int c) {
        for(int i = 0;i<maze.length;i++){
            for(int j = 0;j<maze[i].length;j++){
                if(i == r && j == c) System.out.print("*");
                else System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    int[] findStartPosition(char[][] maze) {
        int[] array = new int[2];
        for(int i = 0;i<maze.length;i++){
            for(int j = 0;j<maze[i].length;j++){
                if(maze[i][j] == 'S'){
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }

    char getMove() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter your move(a,s,d,w): ");
            char move = in.next().charAt(0);
            if(move == 'a' || move == 's' || move == 'd' || move == 'w'){
                return move;
            }
            System.out.println("illegal input, PLZ enter again");
        }while(true);
    }

    int[] findNewPosition(int r, int c, char m) {
        int[] array = new int[2];
        if(m == 'a') c-=1;
        else if(m == 's') r+=1;
        else if(m == 'd') c+=1;
        else r-=1;
        array[0] = r;
        array[1] = c;
        return array;
    }

    boolean isValidMove(char[][] maze, int r, int c) {
        if(r < 0 || c < 0 || r > maze.length-1 || c > maze[maze.length - 1].length-1 || maze[r][c] == 'X'){
            System.out.println("Invalid move!");
            return false;
        }
        return true;
    }

    boolean isWin(char[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[maze.length-1].length-1){
            System.out.println("You Win!");
            return true;
        }
        return false;
    }
}
