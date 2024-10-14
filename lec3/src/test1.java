public class test1 {
    public static void main(String[] args) {
        new test1().runApp();
    }
    public  void runApp(){
        String[] ballots = {"a","b","c","a","c"};
        String[] candidate = new String[ballots.length];
        int[] vote = new int[ballots.length];
        int numOfCan = 0;

        for(int i = 0;i< ballots.length;i++){
            boolean onList = false;
            for(int j = 0;j < numOfCan;j++){
                if(ballots[i].equals(candidate[j])){
                    vote[j]++;
                    onList = true;
                    break;
                }
            }
            if(!onList){
                candidate[numOfCan] = ballots[i];
                vote[numOfCan] = 1;
                numOfCan++;
            }
        }

        for(int i = 0;i<numOfCan;i++){
            System.out.println("Candidate: "+ i + " : " + candidate[i] + " vote: "+ vote[i]);
        }
    }
}
