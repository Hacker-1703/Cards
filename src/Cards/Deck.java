package Cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    Deck(int numberCards) throws Exception {
        if (numberCards == 52) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(suit, rank));
                }
            }
        } else if (numberCards == 36) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    if (rank == Rank.TWO || rank == Rank.THREE || rank == Rank.FOR || rank == Rank.FIVE) {
                        continue;
                    }
                    cards.add(new Card(suit, rank));
                }
            }
        } else {
            throw new Exception("Введено неверное количество карт (может быть только 52 или 36).");
        }

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void arrange() {
        cards.sort((card1, card2) -> {
            int suitComparison = card1.getRank().compareTo(card2.getRank());
            if (suitComparison != 0) {
                return suitComparison;
            }
            return card1.getSuit().compareTo(card2.getSuit());
        });
    }

    public String viewDeck() {
        String infoCards = "";
        for (Card card : cards) {
            infoCards = infoCards + card + "\n";
        }
        return infoCards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}