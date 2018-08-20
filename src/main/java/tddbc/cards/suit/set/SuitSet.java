package tddbc.cards.suit.set;

import tddbc.cards.Card;
import tddbc.cards.suit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * スートセット
 */
public abstract class SuitSet {

    List<SuitCard> suitCards = new ArrayList<>();

    protected SuitSet(SuitType suitType) {
        for (Rank rank : Rank.values()) {
            suitCards.add(new SuitCard(rank, suitType));
        }
    }

    public List<Card> toCards() {
        return new ArrayList<>(suitCards);
    }
}
