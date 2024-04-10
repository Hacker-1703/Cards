package Cards;

public class Main {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck(52);
        System.out.println(deck.getCards().get(0).getRank());
        System.out.println(deck.getCards().get(0).getSuit());
        System.out.println(deck.getCards().get(0));
        deck.shuffle();
        deck.arrange();
        deck.viewDeck();
    }
}
