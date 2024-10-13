import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        new test2().runApp();
    }
    public void runApp(){
        String shoppingCart = "";
        float total = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("apple - $5 banana - $3 carrot - $12.5 durian - $43:");
            String input = in.next();
            int sign = 1;
            if(input.equalsIgnoreCase("cancel")){
                sign = -1;
                input = in.next();

            }
            switch(input.toLowerCase()){
                case "apple": total += sign*5; break;
                case "banana": total += sign*3; break;
                case "carrot": total += sign*12.5f; break;
                case "durian": total += sign*43; break;
                default:
                    System.out.println("Error");
                    continue;
            }

            shoppingCart += input.toLowerCase() + (sign == -1?" Canceled\n":'\n');
            System.out.print("shoppingCart: \n"+shoppingCart);
            System.out.printf("Total:%.1f\n",total);
        }
    }
}
