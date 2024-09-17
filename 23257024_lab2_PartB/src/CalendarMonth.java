import java.util.Scanner;

public class CalendarMonth {
    public static void main(String[] args) {
        new CalendarMonth().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);

        System.out.print(" Enter the start day:");
        int day = in.nextInt();
        in.nextLine();

        System.out.print(" Enter the number of days:");
        int dayNUM = in.nextInt();


        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for(int i = 0;i<7;i++){
            System.out.print(" ---");
        }
        System.out.print("\n");
        for(int i = 1,j = 1;i < day+dayNUM+1;i++){
            if(i < day+1){
                System.out.print("\t");
            }
            else{
                System.out.printf("%4d",j++);
            }

            if(i % 7 == 0 && i != 0 && i != day+dayNUM){
                System.out.print("\n");
            }
        }
        System.out.print("\n");
        for(int i = 0;i<7;i++){
            System.out.print(" ---");
        }
        System.out.print("\n");
    }
}
