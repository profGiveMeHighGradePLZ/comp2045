import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIOMan {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "abc.txt";
        File inputFile = new File(filename);
        if (!inputFile.exists()){
            System.out.println("file not exist.");
            System.exit(-1);

        }
        Scanner in = new Scanner(inputFile);
        while(in.hasNext()) {
            String text = in.nextLine();
            System.out.println(text);
        }
        System.out.println("bye!");

    }
}
