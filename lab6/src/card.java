public class card {
    private int suit;
    private int rank;

    public card(int suit,int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit(){
        return suit;
    }
    public int getRank(){
        return rank;
    }
    public void setSuit(int newSuit){
        suit = newSuit;
    }
    public void setRank(int newRank){
        suit = newRank;
    }
    public boolean equals(card c){
        return this.rank == c.rank && this.suit == c.suit;
    }

    public String toString(){
        String[] suits = {"Diamonds", "Clubs","Hearts","Spades"};
        String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        return  ranks[rank-1] + " of " + suits[suit];
    }
}
