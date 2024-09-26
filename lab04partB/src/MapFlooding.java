import java.util.Scanner;

public class MapFlooding {
    public static void main(String[] args) {
        new MapFlooding().runApp();
    }

    void runApp() {

        int[][] map = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 4, 14, 15, 18, 7, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 4, 15, 40, 65, 22, 0, 0},
                {0, 0, 4, 0, 0, 0, 7, 11, 4, 11, 32, 36, 11, 0, 0},
                {0, 0, 0, 0, 0, 0, 29, 36, 11, 5, 7, 7, 7, 3, 0},
                {0, 0, 0, 0, 0, 8, 25, 32, 10, 3, 5, 3, 5, 2, 0},
                {0, 0, 0, 0, 0, 10, 32, 58, 8, 4, 4, 5, 15, 6, 0},
                {0, 0, 0, 0, 0, 7, 36, 68, 30, 15, 22, 15, 18, 11, 0},
                {0, 0, 0, 0, 0, 11, 5, 18, 45, 62, 20, 12, 5, 0, 0},
                {0, 0, 0, 7, 0, 5, 18, 15, 20, 32, 12, 7, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 11, 8, 10, 18, 15, 7, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 7, 7, 4, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        //TO DO: get the water level and print the flood map
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the water level: ");
        int h = in.nextInt();

        for(int  i = 0;i<map.length;i++){
            for(int j = 0;j<map[0].length;j++){
                if(h >= map[i][j]) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }

}
