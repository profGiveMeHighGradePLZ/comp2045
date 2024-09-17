public class oddNumbers {
    public static void main(String[] args) {
        new oddNumbers().runApp();
    }
    public void runApp(){
        for(int i = 1;i<51;i++){
            System.out.printf("%d ",(i-1)*2+1);
            if(i%10 == 0 && i != 0){
                System.out.println();
            }
        }
    }
}
