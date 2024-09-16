import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        new age().runApp();
    }
    public void runApp(){
        System.out.print("Enter today's date:");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int date = in.nextInt();
        System.out.print("Enter a person's birth date:");
        int birth_year = in.nextInt();
        int birth_month = in.nextInt();
        int birth_date = in.nextInt();

        int age = year - birth_year;

        if(month - birth_month <= 0){
            if(date - birth_date < 0) {
                age--;
            }
        }
        System.out.println(age);
    }
}
