package tddbc.poker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tddbc.cards.Card;
import tddbc.cards.Cards;
import tddbc.cards.suit.Rank;
import tddbc.cards.suit.SuitCard;
import tddbc.cards.suit.SuitType;
import tddbc.poker.helper.CardSet;
import tddbc.poker.io.InputParser;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@Tag("All")
public class HandTests {

    @Test
    @DisplayName("手札を表示できること")
    public void toSuitCardArray() {
        Hand hand = new Hand(CardSet.forHighCards());
        assertEquals("|A♠|4♥|8♠|J♦|Q☘|", hand.showCards());
    }

    @Test
    @DisplayName("手札を捨てられること")
    public void discard() {
        Hand hand = new Hand(CardSet.forHighCards());
        Cards releaseTargets = new InputParser().parse("4♥", "8♠");
        hand.discard(releaseTargets);
        assertEquals("|A♠|J♦|Q☘|", hand.showCards());
    }

    @Test
    @DisplayName("手札を交換できること")
    public void changeCards() {
        Hand hand = new Hand(CardSet.forHighCards());
        Cards releaseTargets = new InputParser().parse("4♥", "8♠");
        hand.discard(releaseTargets);
        Card card1 = new SuitCard(Rank.ACE, SuitType.HEART);
        Card card2 = new SuitCard(Rank.ACE, SuitType.DIAMOND);
        Cards drawCards = new Cards(Arrays.asList(new Card[]{card1, card2}));
        hand.add(drawCards);
        assertEquals("|A♠|J♦|Q☘|A♥|A♦|", hand.showCards());
    }

    @Test
    @DisplayName("手札交換後にランク順に並び替えできること")
    public void sort() {
        Hand hand = new Hand(CardSet.forHighCards());
        Cards releaseTargets = new InputParser().parse("4♥", "8♠");
        hand.discard(releaseTargets);
        Card card1 = new SuitCard(Rank.ACE, SuitType.HEART);
        Card card2 = new SuitCard(Rank.ACE, SuitType.DIAMOND);
        Cards drawCards = new Cards(Arrays.asList(new Card[]{card1, card2}));
        hand.add(drawCards);
        assertEquals("|A♠|J♦|Q☘|A♥|A♦|", hand.showCards());

        hand.sort();
        assertEquals("|A♠|A♦|A♥|J♦|Q☘|", hand.showCards());
    }

    @Test
    @DisplayName("手札内のスートのカード数を取得できること")
    public void countOfSuitCard() {
        Hand hand = new Hand(CardSet.forHighCards());
        assertEquals(Hand.count(), hand.countOfSuitCard());
    }

    @Test
    @DisplayName("ユニークなランクの数を取得できること")
    public void uniqueCountOfRank() {
        Hand hand1 = new Hand(CardSet.forHighCards());
        assertEquals(Hand.count(), hand1.uniqueCountOfRank());

        Hand hand2 = new Hand(CardSet.forOnePairCards());
        assertEquals(Hand.count()-1, hand2.uniqueCountOfRank());
    }

    @Test
    @DisplayName("ユニークなスートの数を取得できること")
    public void uniqueCountOfSuit() {
        Hand hand = new Hand(CardSet.forHighCards());
        assertEquals(4, hand.uniqueCountOfSuit());
    }

    @Test
    @DisplayName("手札内のランクが連続しているか判定できること")
    public void isSequentialRanks() {
        Hand hand = new Hand(CardSet.forHighCards());
        assertFalse(hand.isSequentialRanks());

        hand = new Hand(CardSet.forStraightCards());
        assertTrue(hand.isSequentialRanks());
    }

    @Test
    @DisplayName("手札内のジョーカーの有無を判定できること")
    public void hasWildCard() {
        Hand hand = new Hand(CardSet.forHighCards());
        assertFalse(hand.hasWildCard());
    }
}
