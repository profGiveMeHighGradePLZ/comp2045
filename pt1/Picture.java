import java.util.Scanner;
import java.io.File;

public class Picture {
    public static void main(String[] args) {
        new Picture().runApp("picture1.txt");
        System.out.println("\n\n\n-------------------------------------\n\n\n");
        new Picture().runApp("picture2.txt");
        System.out.println("\n\n\n-------------------------------------\n\n\n");
        new Picture().runApp("nosuchfile.txt");
    }
    //Assignment questions
    int numberOfRows(String filename) {
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
    char[][] readData(String filename) {
        
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

    void printPicture(char[][] picture, char rowChar, char colChar) {
        for (int i = 0; i < picture[0].length + 2; i++) //top row
            System.out.print(rowChar);
        System.out.println();

        for (int i = 0; i < picture.length; i++) {
            System.out.print(colChar);
            System.out.print(picture[i]);  //print a row. Printing a char array is the same as printing it using a loop
            System.out.println(colChar);
        }


        for (int i = 0; i < picture[0].length + 2; i++) //bottom row
            System.out.print(rowChar);
        System.out.println();
    }
    void runApp(String filename) {
        int row = numberOfRows(filename);
        if (row <= 1) {
            System.out.println("Invalid file format");
            return;
        }
        System.out.printf("There are %d rows in the file.\n", numberOfRows(filename));
        char[][] picture = readData(filename);
        System.out.printf("The size of picture is: %d by %d\n", picture.length , picture[0].length);
        System.out.println("Printing the picture out!");        
        for (int i = 0; i < picture.length; i++) 
            System.out.println(picture[i]);

        System.out.println("\nPrint the picture with a different frame!");
        printPicture(picture, 'o', '+');
        System.out.println("\nPrint the picture with a different frame!");
        printPicture(picture, '*', 'u');

    }
}