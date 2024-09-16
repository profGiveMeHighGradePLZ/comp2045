import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) throws Exception {
        new FileOutputExample().runApp();
    }


    void runApp() throws Exception {

        String filename = "output.txt";
        PrintWriter out = new PrintWriter(filename);

        out.print("This ");
        out.print("is ");
        out.println("line 1.");
        out.println("This is line 2.");

        out.close();
    }
}



