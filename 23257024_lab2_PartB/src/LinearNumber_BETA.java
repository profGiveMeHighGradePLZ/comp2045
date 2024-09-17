import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinearNumber_BETA {
    public static void main(String[] args) {
        new LinearNumber_BETA().runApp();
    }
    public void runApp(){
        System.out.print("Please enter the name of the text file: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            // Read lines from the file and display them with line numbers
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

