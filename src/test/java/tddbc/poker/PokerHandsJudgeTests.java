package tddbc.poker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tddbc.poker.helper.CardSet;
import tddbc.poker.pokerhand.PokerHand;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("All")
public class PokerHandsJudgeTests {

    @Test
    @DisplayName("ワンペアの役判定ができること")
    public void call() {
        Hand hand = new Hand(CardSet.forOnePairCards());
        PokerHandsJudge pokerHandsJudge = new PokerHandsJudge();
        assertEquals(PokerHand.ONE_PAIR, pokerHandsJudge.call(hand));
    }
}
