import java.util.Scanner;

public class DistanceOfTwoPoint {
    public static void main(String[] args) {
        new DistanceOfTwoPoint().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        in.nextLine();
        System.out.print("Enter x2 and y2:");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x = Math.pow((x1-x2),2);
        double y = Math.pow((y1-y2),2);
        double distance = Math.sqrt(x+y);
        System.out.printf("The distance of two point is %.2f",distance);
    }
}
