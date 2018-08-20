package tddbc.poker;

import tddbc.poker.pokerhand.PokerHand;

public class PokerHandsJudge {

    public PokerHand call(Hand hand) {
        PokerHand result = PokerHand.HIGH_CARD;
        for (PokerHand pokerHand : PokerHand.values()) {
            if (pokerHand.match(hand)) {
                result = pokerHand;
                break;
            }
        }
        return result;
    }
}
