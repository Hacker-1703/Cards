package Cards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(true);
        deck.shuffle();
        System.out.println(deck.viewDeck());
        deck.arrange();
        System.out.println(deck.viewDeck());
    }
}
