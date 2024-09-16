import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws FileNotFoundException {
//        new test1().runApp();

        String filename = "test1.txt";
        File inputFile = new File(filename);
        if(!inputFile.exists()){
            System.out.println("file not exist");
            System.exit(-1);
        }
        Scanner in = new Scanner(inputFile);

//        while(in.hasNextLine()){
//            System.out.println(in.nextLine());
//        }

//        for(;in.hasNextLine();){
//            System.out.println(in.nextLine());
//        }
        do{
            System.out.println(in.nextLine());
        }while(in.hasNextLine());
    }

    public void runApp(){
//        int n = 5;
//        int i = 0;

//        for (; i < n; i++){  //n is an integer
//            System.out.println(i);
//        }

//        while(i<n){
//            System.out.println(i++);
//        }
//
//
//        do{
//            System.out.println(i++);
//        }while(i < n);
//        System.out.println(i);


    }
}
