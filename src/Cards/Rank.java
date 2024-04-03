package Cards;

public enum Rank {
    TWO(2),
    THREE(3),
    FOR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JOKER(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int num;

    Rank(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }

}
