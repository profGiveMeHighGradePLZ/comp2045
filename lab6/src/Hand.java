public class Hand {
    private card[] cards;

    public Hand(){
        card[] cards = new card[0];
    }

    public int getCount(){
        if(cards == null) return 0;
        return cards.length;
    }

    public void addCard(card c){
        card[] newcards = new card[getCount()+1];
        if(cards != null) {
            for (int i = 0; i < cards.length; i++) {
                newcards[i] = cards[i];
            }
        }
        newcards[getCount()] = c;
        cards = newcards;
    }

    public card getCard(int i){
        return cards[i];
    }

    public void removeCard(int index){
        card[] newcards = new card[getCount()-1];
        for(int i = 0;i<index;i++){
            newcards[i] = cards[i];
        }
        for(int i = index;i<newcards.length;i++){
            newcards[i] = cards[i+1];
        }
        cards = newcards;
    }

    public void removeCard(card c){
        int index = 0;
        boolean has = false;
        for(int i = 0;i<cards.length;i++){
            if(c.equals(cards[i])){
                index = i;
                has = true;
                break;
            }
        }
        if(has){
            card[] newcards = new card[getCount()-1];
            for(int i = 0;i<index;i++){
                newcards[i] = cards[i];
            }
            for(int i = index;i<newcards.length;i++){
                newcards[i] = cards[i+1];
            }
            cards = newcards;
        }
    }
    public String toString(){
        String output = "";
        for(int i = 0;i< cards.length;i++){
            output += "[" + i + "]" +  cards[i] + "\n";
        }
        return output;
    }
}
