package tddbc.cards;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("All")
class CardCaseTests {

    @Test
    void getCards() {
        CardCase box = new CardCase();
        Cards cards = box.getCards();
        assertNotNull(cards);
        assertEquals(52, cards.count());
    }

    @Test
    void getCardsWithJoker() {
        CardCase box = new CardCase();
        Cards cards = box.getCardsWithJoker();
        assertNotNull(cards);
        assertEquals(53, cards.count());
    }
}