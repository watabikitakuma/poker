package tddbc.cards;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("All")
public class CardsTests {

    @Test
    @DisplayName("1枚取得できること")
    public void removeOne() {
        Cards cards = new CardCase().getCards();
        assertEquals(52, cards.count());
        assertNotNull(cards.removeOne());
        assertEquals(51, cards.count());
    }

    @Test
    @DisplayName("シャフルできること")
    public void shuffle() {
        Cards cards = new CardCase().getCards();;
        Cards another = new CardCase().getCards();;
        cards.shuffle();

        assertFalse(cards.equals(another));
    }
}
