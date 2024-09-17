import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        new IsoscelesTriangle().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("n:");
        int n = in.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j < i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
