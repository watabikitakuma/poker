package tddbc.poker.pokerhand;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tddbc.poker.helper.CardSet;
import tddbc.poker.Hand;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("All")
public class PokerHandsRuleTests {

    @Test
    @DisplayName("同じランクのカードが１組と異なるランクのカード３枚の手をワンペアとすること")
    public void onePair() {
        Hand hand = new Hand(CardSet.forOnePairCards());
        PokerHandRule rule = new OnePair();
        assertTrue(rule.match(hand));
    }

    @Test
    @DisplayName("役に当てはまらない手をハイカードとすること")
    public void highCard() {
        Hand hand = new Hand(CardSet.forHighCards());
        PokerHandRule rule = new HighCard();
        assertTrue(rule.match(hand));
    }
}
