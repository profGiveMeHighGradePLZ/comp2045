import java.util.Scanner;

public class ArrayEX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 9;
        int[] nums = new int[n];
//        int sum = 0;

        System.out.print("Enter 9 integers:");
        for(int i = 0;i<n;i++){
            nums[i] = in.nextInt();
//            sum+= num[i];
        }
//        System.out.println(sum);

        System.out.print("Every element at an evan index:");
        for(int i = 0;i<n;i+=2) System.out.printf("  %d", nums[i]);
        System.out.println();

        System.out.print("Every evan element:");
        for(int i = 0;i<n;i++) {
            if(nums[i]%2 == 0) {
                System.out.printf("  %d",nums[i]);
            }
        }
        System.out.println();

        System.out.print("All elements in revers order:");
        for(int i = 0;i<n;i++) {
            System.out.printf("  %d",nums[n-1-i]);
        }
        System.out.println();

        int sum = 0;
        System.out.print("Alternating sum:");
        for(int i = 0;i<n;i++) {
            if(i % 2 == 0){
                sum += nums[i];
            }
            else{
                sum -= nums[i];
            }
        }
        System.out.printf("  %d\n",sum);
    }
}
