import java.io.*;

public class FileAppendExample {
    public static void main(String[] args) throws Exception {
        new FileAppendExample().runApp();
    }

    void runApp() throws Exception {

        String filename = "appendOutput.txt";
        FileWriter fwriter = new FileWriter(filename, true);
        PrintWriter out = new PrintWriter(fwriter);

        out.println("This is a line.");

        out.close();
    }
}



