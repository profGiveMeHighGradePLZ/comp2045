import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        new Rect().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("m:");
        int m = in.nextInt();
        in.hasNextLine();
        System.out.print("n:");
        int n = in.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
