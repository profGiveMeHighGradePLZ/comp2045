public class AryRotation {

    public static void main(String[] args) {
        new AryRotation().runApp();
    }


    void rotate(int[] a) {
        //TO DO: rotate the elements of array a by one position
        int tmp = a[0];
        for(int i = 1;i<a.length;i++){
                a[i - 1] = a[i];
        }
        a[a.length-1] = tmp;

    }

    //you are not allowed to modify this method
    void printAry(int[] a) {
        System.out.print('|');
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }
        System.out.println();
    }

    //you are not allowed to modify this method
    void runApp() {
        int[] array = {1, 2, 3, 4, 5};
        printAry(array);
        rotate(array);
        printAry(array);
    }

}
