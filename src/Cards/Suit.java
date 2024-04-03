package Cards;

public enum Suit {
    DIAMONDS(1),
    CLUBS(2),
    HEARTS(3),
    SPADES(4);

    int num;

    Suit(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }
}
