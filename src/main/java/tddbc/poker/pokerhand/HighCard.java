package tddbc.poker.pokerhand;

import tddbc.poker.Hand;

/**
 * ハイカード
 */
public class HighCard implements PokerHandRule {
    @Override
    public boolean match(Hand hand) {
        return hand.uniqueCountOfRank() == 5 && hand.uniqueCountOfSuit() == 4;
    }
}
