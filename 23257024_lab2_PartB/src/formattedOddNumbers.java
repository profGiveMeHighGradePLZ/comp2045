public class formattedOddNumbers {
    public static void main(String[] args) {
        new formattedOddNumbers().runApp();
    }
    public void runApp(){
        for(int i = 1;i<51;i++){
            System.out.printf("%4d",(i-1)*2+1);
            if(i%10 == 0 && i != 0){
                System.out.println();
            }
        }
    }
}
