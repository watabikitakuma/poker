package tddbc.cards.suit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tddbc.cards.suit.Rank;
import tddbc.cards.suit.SuitCard;
import tddbc.cards.suit.SuitType;

import static org.junit.jupiter.api.Assertions.*;

@Tag("All")
class SuitCardTests {

    SuitCard suitCard = new SuitCard(Rank.ACE, SuitType.SPADE);

    @Test
    public void type() {
        assertEquals(SuitType.SPADE, suitCard.suitType());
    }

    @Test
    public void number() {
        assertEquals(Rank.ACE, suitCard.rank());
    }

    @Test
    public void name() {
        assertEquals("A♠", suitCard.name());
    }

    @Test
    public void isSuit() {
        assertTrue(suitCard.isSuit());
    }
}