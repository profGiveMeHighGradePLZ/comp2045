import java.util.Scanner;

public class charFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line:");
        String line = in.nextLine();
        System.out.print("Enter a character:");
        char character = in.nextLine().charAt(0);

        int count = 0;
        for(int i = 0;i<line.length();i++){
            if(character == line.charAt(i) || character == (line.charAt(i)-'A'+'a')){
                count++;
                System.out.print("_");
            }
            else System.out.print(line.charAt(i));
        }
        System.out.printf("\nNo. of occurrences of %c:%d",character,count);
    }
}
