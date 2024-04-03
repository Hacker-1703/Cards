package Cards;

public class Card {
    private final Suit suit;
    private final Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String getInfo() {
        return "Ранк: " + rank + ", масть: " + suit;
    }

    @Override
    public String toString() {
        return "Ранк: " + rank + ", масть: " + suit;
    }
}
