public class Merging {

    public static void main(String[] args) {

        new Merging().runApp();
    }


    void runApp() {

        int[] a = {1, 6, 11, 12};
        int[] b = {3, 5, 7, 9, 10};

        int la=0,lb=0;
        int[] c = new int[a.length+b.length];
        int tmp = 0;

        while(la < a.length || lb<b.length){
            if(la < a.length && lb < b.length){
                if(a[la] >= b[lb]){
                    tmp = b[lb++];
                }
                else tmp = a[la++];
            }
            else if(la < a.length) tmp = a[la++];
            else tmp = b[lb++];

            c[la+lb-1] = tmp;
        }



        for(int i:c) System.out.println(i);

    }

}
