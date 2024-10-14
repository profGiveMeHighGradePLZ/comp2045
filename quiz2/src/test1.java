public class test1 {
    public static void main(String[] args){
        new test1().runApp();
    }
    public void runApp(){
        String[] nameList = {"a","b","c"};
        int[] value = {1,2,3};

        try {
            System.out.println(findValue(nameList, value, "d"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    int findValue(String[] nameList,int[] value,String name) throws Exception{
        for(int i = 0;i< nameList.length;i++){
            if(nameList[i].equals(name)){
                return value[i];
            }
        }
        throw new Exception(name + " is not found");
    }
}
