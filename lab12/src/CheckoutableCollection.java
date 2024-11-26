import java.util.ArrayList;
import java.util.List;

public class CheckoutableCollection {
    public static void main(String[] args) {
        List<Checkoutable> list = new ArrayList<>();
        list.add(new Book("Cindy and the Candy Factory", "AA Press" ,"Ben Don"));
        list.add(new Book("Secret Code", "Ma House" ,"Dim Green"));
        list.add(new Magazine("Living" ,"Person" ,5 ,3));
        list.add(new Magazine("Cooking" ,"Person" ,3 ,10));
        list.add(new KidsMagazine("Tinkering", "Teens World", 3, 10, 6,12));
        list.add(new KidsMagazine("My Dream", "Teens World",8, 5, 3,6));


        for(Checkoutable checkoutable:list){
            checkoutable.checkout();
            System.out.println("Return Date: "+checkoutable.returnDate());
            System.out.println();
        }
    }
}
