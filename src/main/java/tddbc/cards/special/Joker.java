package tddbc.cards.special;

import tddbc.cards.Card;
import tddbc.cards.CardType;

/**
 * ジョーカー
 */
public class Joker implements Card {

    CardType type = CardType.ジョーカー;
    private static final String SYMBOL = "JK";

    public static boolean of(String cardName) {
        return SYMBOL.equals(cardName);
    }

    @Override
    public String name() {
        return type.name();
    }

    @Override
    public boolean isSuit() {
        return false;
    }
}
