public class test2 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.addCard(new card(0, 1));
        System.out.println("No of cards : " + hand.getCount());
        System.out.println(hand);
        hand.addCard(new card(1,5));
        System.out.println("No of cards : " + hand.getCount());
        System.out.println(hand);

        hand.addCard(new card(2, 11));
        System.out.println("No of cards : " + hand.getCount());
        System.out.println(hand);

        hand.addCard(new card(3, 13));
        System.out.println("No of cards : " + hand.getCount());
        System.out.println(hand);

        hand.removeCard(1);
        System.out.println("No of cards : " + hand.getCount());
        System.out.println(hand);
        hand.removeCard(new card(2, 11));
        System.out.println("No of cards : " + hand.getCount());
        System.out.println(hand);

//        System.out.println(hand.getCard(1));
    }
}
