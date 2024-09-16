import java.util.Scanner;

public class parkingCharge {
    public static void main(String[] args) {
        new parkingCharge().runApp();
    }
    public void runApp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Type of vehicle:");
        String carType = in.next();
        System.out.print("Hours the vehicle spent:");
        int hours = in.nextInt();

        int cost = 0;
        if(carType.equals("t")){
            cost = hours * 63;
        }
        else if(carType.equals("c")){
            cost = hours * 38;
        }
        else{
            cost = hours * 56;
        }

        System.out.printf("Parking Charge: %d\n",cost);
    }
}
