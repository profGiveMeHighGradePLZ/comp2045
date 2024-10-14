public class test3 {
    public static void main(String[] args) {
        new test3().runApp();
    }
    public void runApp(){
        String[] oldArray = {"a","b","c","d","e"};
        String[] newArray = new String[oldArray.length-1];
        int indexToRemove = 2;

        for(int i = 0;i<indexToRemove;i++){
            newArray[i] = oldArray[i];
        }
        for(int i = indexToRemove;i<newArray.length;i++){
            newArray[i] = oldArray[i+1];
        }
        oldArray = newArray;

        for(String i : oldArray){
            System.out.println(i);
        }
    }
}
