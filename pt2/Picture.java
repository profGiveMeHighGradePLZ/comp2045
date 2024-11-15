import java.io.File;
import java.util.Scanner;

public class Picture {
    private String filename;
    private char[][] map;

    public Picture(String filename){
        this.filename = filename;
//        if(!filename.equals("null"))
            map = readData(filename);
    }

    private int numberOfRows(String filename) {
        int i = 0;
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                i++;
                scanner.nextLine(); //many student miss this one
            }
        } catch (Exception e) {
            System.out.println("There are errors in reading the file: " + filename);
        }
        return i;
    }


    private char[][] readData(String filename) {

        try (Scanner scanner = new Scanner(new File(filename))) {

            int totalRow = numberOfRows(filename) - 2; //-2 because removing the top and bottom of the frame
            char[][] result = new char[totalRow][];
            scanner.nextLine(); //skip one line on purpose
            for (int row = 0; row < totalRow; row++) {
                String line = scanner.nextLine();
                result[row] = new char[line.length() - 2];
                for (int i = 0; i < line.length() - 2; i++)  //always play your loop from 0, easier for everyone
                    result[row][i] = line.charAt(i + 1);   //+1 to skip the left frame
            }
            return result;
        } catch (Exception e) {
            System.out.println("Error reading lines");
            return null;
        }
    }

    public char[][] getMap(){
        return map;
    }
}
