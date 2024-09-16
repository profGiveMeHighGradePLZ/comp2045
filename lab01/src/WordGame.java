import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        new WordGame().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.print("Enter your age:");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Enter the name of a city:");
        String city = in.nextLine();
        System.out.print("Enter the name of a college:");
        String college = in.nextLine();
        System.out.print("Enter a profession:");
        String profession = in.nextLine();
        System.out.print("Enter a type of animal:");
        String animal = in.nextLine();
        System.out.print("Enter a pet's name:");
        String pet_name = in.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city
        + ".\n" + "At the age of " + age + ", " + name + " went to college at " + college + ".\n"
        + name + " graduated and went to work as a(n) " + profession + ".\n" + "Then, " +
        name + " adopted a(n) " + animal + " named " + pet_name + ".\n" +"They both lived happily ever after!" );
    }
}
