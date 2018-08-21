package tddbc.cards.suit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tddbc.cards.Card;
import tddbc.poker.helper.CardSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("All")
public class SuitCardsTests {

    @Test
    @DisplayName("スートカードのテキスト配列を取得できること")
    public void toTextArray() {
        Card[] cards = CardSet.forHighCards();
        SuitCards suitCards = new SuitCards(cards);
        String[] actual = suitCards.toTextArray();

        assertEquals("A♠", actual[0]);
        assertEquals("Q♣", actual[1]);
        assertEquals("8♠", actual[2]);
        assertEquals("J♦", actual[3]);
        assertEquals("4♥", actual[4]);
    }

    @Test
    @DisplayName("指定されたスートカードを捨てることができること")
    public void discard() {
        Card[] cards = CardSet.forHighCards();
        SuitCards suitCards = new SuitCards(cards);

        suitCards.discard(new SuitCard(Rank.EIGHT, SuitType.SPADE));
        suitCards.discard(new SuitCard(Rank.FOUR, SuitType.HEART));

        assertEquals(3, suitCards.count());

        String[] actual = suitCards.toTextArray();

        assertEquals("A♠", actual[0]);
        assertEquals("Q♣", actual[1]);
        assertEquals("J♦", actual[2]);
    }
}
