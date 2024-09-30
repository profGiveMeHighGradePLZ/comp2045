import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class enhancedMapFlooding {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = in.nextLine();
        System.out.print("Enter the water level: ");
        int level = in.nextInt();
        in.close();

        File inputfile = new File(filename);

        if(!inputfile.exists()){
            System.out.println("The file is not found.");
            System.exit(0);
        }
        Scanner scr = new Scanner(inputfile);
        int row = scr.nextInt();
        int col = scr.nextInt();
//        System.out.println(row);
//        System.out.println(col);

        int[][] map = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                map[i][j] = scr.nextInt();
            }
        }//put all the num in input file into the array map

//        System.out.println(map[1][12]);

        for(int  i = 0;i<map.length;i++){
            for(int j = 0;j<map[0].length;j++){
                if(level >= map[i][j]) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
