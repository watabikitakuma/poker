package tddbc.poker.io;

import tddbc.cards.Card;
import tddbc.cards.Cards;
import tddbc.cards.special.Joker;
import tddbc.cards.suit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * カードパーサー
 */
public class CardParser {

    public Cards parse(String... cardNames) {
        List<Card> cards = new ArrayList<>();
        for (String cardName : cardNames) {
            cards.add(parse(cardName));
        }
        return new Cards(cards);
    }

    private Card parse(String cardName) {
        if (Joker.of(cardName)) {
            return new Joker();
        }
        Rank rank = Rank.shortNameOf(cardName);
        SuitType suitType = SuitType.symbolOf(cardName);
        return new SuitCard(rank, suitType);
    }
}
