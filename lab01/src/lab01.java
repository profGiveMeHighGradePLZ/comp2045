import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        new lab01().runApp();
    }
    public void runApp() {
//        System.out.println(" \\\\\\\\  ");
//        System.out.println("+\"\"\"\"\"+");
//        System.out.println("| - * |");
//        System.out.println("|  V  |");
//        System.out.println(" \\   /");
//        System.out.println("  ___  ");

//        int i = 5;
//        System.out.println(i++);     // prints 5
//        System.out.println(--i);     // prints 5
//        System.out.println(++i);     // prints 6
//        System.out.println(i++);     // prints 6
//        System.out.println(++i);     // prints 8
//        System.out.println(i--);     // prints 8
//        System.out.println(--i);     // prints 6
//        System.out.println(i++);     // prints 6
//        System.out.println(i);

//        int n = 12345;
//        double pi = Math.PI;
//        String str = "Hello";
//
//        System.out.printf("[%d]\n", n);
//        System.out.printf("[%9d]\n", n);
//        System.out.printf("[%-9d]\n", n);
//        System.out.printf("[%09d]\n",n);
//        System.out.printf("[%,9d]\n",n);
//        System.out.printf("[%+,9d]\n",n);
//
//        System.out.printf("[%f]\n", pi);
//        System.out.printf("[%.3f]\n", pi);
//        System.out.printf("[%8.3f]\n", pi);
//        System.out.printf("[%+8.3f]\n", pi);
//
//        System.out.printf("[%s]\n", str);
//        System.out.printf("[%10s]\n",str);
//        System.out.printf("[%-10s]\n",str);

//        char c = 'a';
//        System.out.println((int)c);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = in.nextInt();
//
//        System.out.print("Enter your name: ");
//        String name = in.nextLine();
//        in.nextLine();
//        System.out.println();
//        System.out.println("Hello " + name + "!");
//        System.out.println("You are " + age + " years old.");
//
//        in.close();
//

//            int x = 4, y = 3;
//            if (y == 0) {
//                System.out.println("No Solution.");
//            } else if (x % y == 0) {
//                System.out.println("x is divisible by y");
//            } else {
//                System.out.println("x is not divisible by y");
//            }
//        int x = 1;
//        int y = 2;
//        int z = 0;
//
//        if (x != 0 && y / x > 0) {
//            System.out.print("A");
//        }
//        if (y - z != 1 && x * y * z == 0) {
//            System.out.print("B");
//        }
//        if ( x + y == 3 || y / z < 0) {
//            System.out.print("C");
//        }

//        char c = 'I';
//        int countE = 0;
//        int countA = 0;
//        int countI = 0;
//        switch(c){
//            case 'e':
//            case 'E':
//                countE++;
//                break;
//            case 'a':
//            case 'A':
//                countA++;
//                break;
//            case 'i':
//            case 'I':
//                countI++;
//                break;
//            default:
//                System.out.println("Error—Not A, E, or I");
//        }
//        System.out.println(countI);
        int x = 176;
        if(x == 101 || x == 105){
            System.out.println("Turn Left");
        }
        else if(x == 121 || x == 176){
            System.out.println("Turn Right");
        }
        else{
            System.out.println("Stop");
        }
    }

}
