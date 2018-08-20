package tddbc.cards.suit;

/**
 * スートタイプ
 */
public enum SuitType {
    SPADE("スペード", "♠"),
    DIAMOND("ダイヤ", "♦"),
    CLUB("クローバー", "☘"),
    HEART("ハート", "♥");

    private String name;
    private String symbol;

    private SuitType(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String symbol() {
        return symbol;
    }

    public static SuitType symbolOf(String cardName) {
        for (SuitType suitType : SuitType.values()) {
            if (suitType.symbol().equals(cardName.substring(1))) {
                return suitType;
            }
        }
        throw new IllegalArgumentException("想定してる文字列ではありません");
    }
}
