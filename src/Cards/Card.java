package Cards;

public class Card {
    private final Suit suit;
    private final Rank rank;
    Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Ранк: " + rank + ", масть: " + suit;
    }
}
