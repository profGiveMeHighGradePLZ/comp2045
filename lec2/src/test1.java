import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class test1 {
    public static void main(String[] args) {
//        for(int i = 0;i<10;i++) {
//            boolean random = ThreadLocalRandom.current().nextBoolean();
//            System.out.println(random);
//        }
        new test1().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        int secret = ThreadLocalRandom.current().nextInt(0,101);
        int guess;
        int L = 0;
        int R = 100;
        int count = 0;
        do{
            System.out.print("Guess a num: ");
            guess = in.nextInt();
            if(guess < L || guess > R){
                System.out.println("Out of range!");
                continue;
            }
            if(guess > secret) {
                R = guess-1;
                count++;
                System.out.printf("BIG(%d,%d)\n",L,R);
            }
            else if(guess < secret) {
                L = guess+1;
                count++;
                System.out.printf("SMALL(%d,%d)\n",L,R);
            }
            else {
                System.out.println("YES");
                System.out.println("count: " + count);
            }
        }while(guess != secret);
    }
}
