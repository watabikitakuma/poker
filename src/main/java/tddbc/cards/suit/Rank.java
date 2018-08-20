package tddbc.cards.suit;

/**
 * ランク
 */
public enum Rank {
    ACE("A", 1, true),
    TWO("2", 2, true),
    THREE("3", 3, true),
    FOUR("4", 4, true),
    FIVE("5", 5, true),
    SIX("6", 6, true),
    SEVEN("7", 7, true),
    EIGHT("8", 8, true),
    NINE("9", 9, true),
    TEN("10", 10, true),
    JACK("J", 11, false),
    QUEEN("Q", 12, false),
    KING("K", 13, false);

    private String shortName;
    private int number;
    private boolean pip;

    private Rank(String shortName, int number, boolean pip) {
        this.shortName = shortName;
        this.number = number;
        this.pip = pip;
    }

    public String shortName() {
        return shortName;
    }

    public int number() {
        return number;
    }

    public boolean hasPip() {
        return pip;
    }

    public static Rank shortNameOf(String cardName) {
        for (Rank rank : Rank.values()) {
            if (rank.shortName().equals(cardName.substring(0, 1))) {
                return rank;
            }
        }
        throw new IllegalArgumentException("想定してる文字列ではありません");
    }
}
