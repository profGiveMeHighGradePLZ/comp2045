import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Complete the required method below. Don't change the runApp or main method.
 *
 * Each method worth 10%, total 30%
 *
 * Expected running result:
There are 9 rows in the picture1.txt file.
Print the picture!
           +...........
          ###..........
        =======........
         #####.........
         #####.........
      ###+++++###......
   ##+++++++++++++##...
 ##+               +##.
####               ####


Print the picture with its height doubled!
           +...........
           +...........
          ###..........
          ###..........
        =======........
        =======........
         #####.........
         #####.........
         #####.........
         #####.........
      ###+++++###......
      ###+++++###......
   ##+++++++++++++##...
   ##+++++++++++++##...
 ##+               +##.
 ##+               +##.
####               ####
####               ####


Print the picture with its width and height doubled!
                      ++......................
                      ++......................
                    ######....................
                    ######....................
                ==============................
                ==============................
                  ##########..................
                  ##########..................
                  ##########..................
                  ##########..................
            ######++++++++++######............
            ######++++++++++######............
      ####++++++++++++++++++++++++++####......
      ####++++++++++++++++++++++++++####......
  ####++                              ++####..
  ####++                              ++####..
########                              ########
########                              ########


------------------------------------------------------------------


There are 4 rows in the picture2.txt file.
Print the picture!
  ///||\\\\\\\
 *   o    o   *
 *     --     *
   **********


Print the picture with its height doubled!
  ///||\\\\\\\
  ///||\\\\\\\
 *   o    o   *
 *   o    o   *
 *     --     *
 *     --     *
   **********
   **********


Print the picture with its width and height doubled!
    //////||||\\\\\\\\\\\\\\
    //////||||\\\\\\\\\\\\\\
  **      oo        oo      **
  **      oo        oo      **
  **          ----          **
  **          ----          **
      ********************
      ********************


------------------------------------------------------------------


There are errors in reading the file: nosuchfile.txt
No output.

 */


public class Sketcher {
    public static void main(String[] args) {
        new Sketcher().runApp("picture1.txt");
        System.out.println("\n\n------------------------------------------------------------------\n\n");
        new Sketcher().runApp("picture2.txt");
        System.out.println("\n\n------------------------------------------------------------------\n\n");
        new Sketcher().runApp("nosuchfile.txt");
    }

    void runApp(String filename) {
        char[][] data = readData(filename);

        if (data == null) {
            System.out.printf("There are errors in reading the file: %s\n", filename);
            System.out.println("No output.");
            return;
        }
        System.out.printf("There are %d rows in the %s file.\n", data.length, filename);
        System.out.println("Print the picture!");
        print(data);

        data = doubleHeight(data);
        System.out.println("\n\nPrint the picture with its height doubled!");
        print(data);

        data = doubleWidth(data);
        System.out.println("\n\nPrint the picture with its width and height doubled!");
        print(data);

    }

    void print(char[][] data) {
        for(char[] array:data){
            for(char element:array){
                System.out.print(element);
            }
            System.out.println();
        }
    }

    char[][] readData(String filename) {
        File inputfile = new File(filename);
        try(Scanner in = new Scanner(inputfile)){
            int rows = in.nextInt();
            in.nextLine();
            char[][] data = new char[rows][];
            for(int row = 0;row<rows;row++){
                String line = in.nextLine();
                data[row] = new char[line.length()];
                for(int i = 0;i<line.length();i++){
                    data[row][i] = line.charAt(i);
                }
            }
            return data;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    char[][] doubleWidth(char[][] data) {
        char[][] newData = new char[data.length][];
        for(int i = 0;i< data.length;i++){
            int index = 0;
            newData[i] = new char[data[i].length*2];
            for(int j = 0;j< data[i].length;j++){
                newData[i][index++] = data[i][j];
                newData[i][index++] = data[i][j];
            }

        }
        return newData;
    }

    char[][] doubleHeight(char[][] data) {
        char[][] newData = new char[data.length*2][];
        int index = 0;
        for(int i = 0;i< data.length;i++){
            newData[index] = new char[data[i].length];
            for(int j = 0;j<data[i].length;j++){
                newData[index][j] = data[i][j];
            }
            index++;
            newData[index] = new char[data[i].length];
            for(int j = 0;j<data[i].length;j++){
                newData[index][j] = data[i][j];
            }
            index++;
        }
        return newData;
    }

}
