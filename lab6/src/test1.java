public class test1 {
    public static void main(String[] args) {
        card[] cards = {
                new card(0,1),
                new card(0,1),
                new card(1,2)
        };
        for (int i=0; i<cards.length; i++) {
            for (int j=i;j<cards.length;j++) {
                if (i == j) continue;
                card a = cards[i];
                card b = cards[j];
                System.out.printf("Card #%d: %s\n", i, a);
                System.out.printf("Card #%d: %s\n", j, b);
                if (a.equals(b)) {
                    System.out.println("They are equal.");
                } else {
                    System.out.println("They are not equal.");
                }
                System.out.println();
            }
        }
    }
}
