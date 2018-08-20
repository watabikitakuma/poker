package tddbc.cards.special;

import tddbc.cards.Card;

/**
 * ジョーカー
 */
public class Joker implements Card {

    private static final String SYMBOL = "JK";

    public static boolean of(String cardName) {
        return SYMBOL.equals(cardName);
    }

    @Override
    public String name() {
        return "ジョーカー";
    }

    @Override
    public boolean isSuit() {
        return false;
    }
}
