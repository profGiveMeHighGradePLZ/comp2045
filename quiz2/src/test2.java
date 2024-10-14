import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        new test2().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a number:");
            int num = in.nextInt();
            System.out.printf("100/ %d = %d",num,100/num);
        }catch (ArithmeticException e){
            System.out.println("1");
        }catch (InputMismatchException e){
            System.out.println("2");
        }
    }
}
