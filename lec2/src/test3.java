public class test3 {
    public static void main(String[] args) {
        new test3().runApp();
    }
    public void runApp(){
        int size = 5;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++)
//                System.out.print( ((i+j)%2==0 ? '*' : 'o') );
//            System.out.println();
//        }
        for(int i = 0;i<size;i++){
            for(int j = size-i;j>=0;j--){
                System.out.print(" ");
            }
            if(i != 0) {
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }

    }
}
