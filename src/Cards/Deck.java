package Cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    Deck(boolean fullDeck) {
        if (fullDeck) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(suit, rank));
                }
            }
        } else {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    for (int i = 0; i < 6; i++) {
                        continue;
                    }
                    cards.add(new Card(suit, rank));
                }
            }
        }

    }

    public Card[] shuffle(Card[] cards) {
        Collections.shuffle(List.of(cards));
        return cards;
    }
}