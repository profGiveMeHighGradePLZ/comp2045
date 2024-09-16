import java.util.Scanner;
import java.io.File;

public class FileInputExample {
    public static void main(String[] args) throws Exception {
        new FileInputExample().runApp();
    }


    void runApp() throws Exception {

        String filename = "input.txt";
        File inputFile = new File(filename);

        if (!inputFile.exists()) {
            System.out.println("The file " + filename + " is not found.");
            System.exit(0);
        }

        Scanner in = new Scanner(inputFile);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}


