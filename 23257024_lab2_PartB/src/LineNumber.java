import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        new LineNumber().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String fileName = in.nextLine();
        in.close();

        //`BufferedReader` is a class in Java that is used
        // to read text from an input stream efficiently.
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            int lineNUM = 1;
            String Line;

            while((Line = reader.readLine()) != null){
                System.out.printf("%d: %s\n",lineNUM++,Line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        /*try and catch are statements used to handle exceptions,
        and they constitute an exception handling mechanism.
        In a try statement, the program executes a section of code.
        If an exception occurs, it will be caught and transferred to
        the corresponding catch statement for processing.*/
    }
}
