package tddbc.poker.pokerhand;

import tddbc.poker.Hand;

public enum PokerHand {
    HIGH_CARD(new HighCard()),
    ONE_PAIR(new OnePair());

    private PokerHandRule rule;

    PokerHand(PokerHandRule rule) {
        this.rule = rule;
    }

    public boolean match(Hand hand) {
        return rule.match(hand);
    }
}
