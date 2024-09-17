public class ReverseOddNumbers {
    public static void main(String[] args) {
        new ReverseOddNumbers().runApp();
    }
    public void runApp(){
        for(int i = 50;i>0;i--){
            if(i%10 == 0 && i != 50){
                System.out.println();
            }
            System.out.printf("%4d",i*2-1);

        }
    }
}
