import java.io.*;
import java.util.Scanner;

public class LineNumberToFile {
    public static void main(String[] args) {
        new LineNumberToFile().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input filename: ");
        String inputFileName = in.nextLine();
        System.out.print("Enter the output filename: ");
        String outputFileName = in.nextLine();
        in.close();


        try(BufferedReader reader = new BufferedReader(new FileReader(inputFileName))){
            String line;
            int NUM = 1;
            FileWriter fwrite = new FileWriter(outputFileName,true);

            while((line = reader.readLine()) != null){
                fwrite.write(NUM + ": " + line + "\n");
                NUM++;
            }
            fwrite.close();


        } catch (IOException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
