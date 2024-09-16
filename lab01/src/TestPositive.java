import java.util.Scanner;

public class TestPositive {
    public static void main(String[] args) {
        new TestPositive().runApp();
    }
    static void runApp(){
        System.out.print("Enter an integer:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < 0) {
            System.out.println("The value is negative.");
        }
        else if(num == 0) {
            System.out.println("The value is zero.");
        }
        else {
            System.out.println("The value is positive.");
        }
        System.out.println("Good Bye!");
    }
}
