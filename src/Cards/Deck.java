package Cards;

import java.util.ArrayList;
import java.util.Collections;

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
                    if (rank == Rank.TWO || rank == Rank.THREE || rank == Rank.FOR || rank == Rank.FIVE) {
                        continue;
                    }
                    cards.add(new Card(suit, rank));
                }
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(cards);
        this.cards = cards;
    }

    public void arrange() {
        for (int i = 0; i < cards.size(); i++) {
            for (int j = cards.size() - 1; j > i; j--) {
                if (cards.get(j - 1).getSuit().getNum() > cards.get(j).getSuit().getNum()) {
                    Card tmp = cards.get(j - 1);
                    cards.set(j - 1, cards.get(j));
                    cards.set(j, tmp);
                }
            }
        }
        for (int i = 0; i < cards.size() / 4; i++) {
            for (int j = cards.size() / 4 - 1; j > i; j--) {
                if (cards.get(j - 1).getRank().getNum() > cards.get(j).getRank().getNum()) {
                    Card tmp = cards.get(j - 1);
                    cards.set(j - 1, cards.get(j));
                    cards.set(j, tmp);
                }
            }
        }
        for (int i = cards.size() / 4; i < cards.size() / 2; i++) {
            for (int j = cards.size() / 2 - 1; j > i; j--) {
                if (cards.get(j - 1).getRank().getNum() > cards.get(j).getRank().getNum()) {
                    Card tmp = cards.get(j - 1);
                    cards.set(j - 1, cards.get(j));
                    cards.set(j, tmp);
                }
            }
        }
        for (int i = cards.size() / 2; i < cards.size() - cards.size() / 4; i++) {
            for (int j = cards.size() - cards.size() / 4 - 1; j > i; j--) {
                if (cards.get(j - 1).getRank().getNum() > cards.get(j).getRank().getNum()) {
                    Card tmp = cards.get(j - 1);
                    cards.set(j - 1, cards.get(j));
                    cards.set(j, tmp);
                }
            }
        }
        for (int i = cards.size() - cards.size() / 4; i < cards.size(); i++) {
            for (int j = cards.size() - 1; j > i; j--) {
                if (cards.get(j - 1).getRank().getNum() > cards.get(j).getRank().getNum()) {
                    Card tmp = cards.get(j - 1);
                    cards.set(j - 1, cards.get(j));
                    cards.set(j, tmp);
                }
            }
        }
    }

    public String viewDeck() {
        String infoCards = "";
        for (Card card : cards) {
            infoCards = infoCards + card.getInfo() + "\n";
        }
        return infoCards;
    }
}