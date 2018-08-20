package tddbc.poker.pokerhand;

import tddbc.poker.Hand;

public interface PokerHandRule {
    boolean match(Hand hand);
}
