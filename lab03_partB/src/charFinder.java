import java.util.Scanner;

public class charFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line:");
        String line = in.nextLine();
        System.out.print("Enter a character:");
        String character = in.nextLine();

        int count = 0;
        for(int i = 0;i<line.length();i++){
            if(character.charAt(0) == line.charAt(i)){
                count++;
                System.out.print("_");
            }
            else System.out.print(line.charAt(i));
        }
        System.out.printf("\nNo. of occurrences of %s:%d",character,count);
    }
}
