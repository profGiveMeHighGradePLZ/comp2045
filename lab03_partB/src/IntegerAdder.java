public class IntegerAdder {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0;i< args.length;i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.printf("Sum:%d\n",sum);
    }
}
