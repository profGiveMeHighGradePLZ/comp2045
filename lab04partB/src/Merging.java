public class Merging {

    public static void main(String[] args) {

        new Merging().runApp();
    }


    void runApp() {

        int[] a = {1, 6, 11, 12};
        int[] b = {3, 5, 7, 9, 10};

        int la=0,lb=0;
        int[] c = new int[a.length+b.length];

        while(la < a.length && lb < b.length){
            if(a[la]>=b[lb]){
                c[la+lb] = b[lb++];
            }
            else{
                c[la+lb] = a[la++];
            }
        }
        while(la == a.length && lb != b.length) c[lb+la] = b[lb++];
        while(la != a.length && lb == b.length) c[lb+la] = a[la++];

        for(int i:c) System.out.println(i);

    }

}
