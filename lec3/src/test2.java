public class test2 {
    public static void main(String[] args) {
        new test2().runApp();
    }
    public void runApp(){
        String[] oldArray = {"a","b","c"};
        String[] newArray = new String[oldArray.length+1];

        int i = 0;
        for(;i< oldArray.length;i++){
            newArray[i] = oldArray[i];
        }
        newArray[i] = "NEW DATA";
        oldArray = newArray;

        for(String j:oldArray){
            System.out.println(j);
        }
    }
}
