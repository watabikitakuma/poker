package tddbc.poker.pokerhand;

import tddbc.poker.Hand;

/**
 * ワンペア
 */
public class OnePair implements PokerHandRule {

    private static final int RANK_COUNT_OF_ONE_PAIR = 4;

    @Override
    public boolean match(Hand hand) {
        return hand.uniqueCountOfRank() == RANK_COUNT_OF_ONE_PAIR;
    }
}
