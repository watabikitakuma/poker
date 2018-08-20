package tddbc.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tddbc.cards.suit.SuitType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("All")
public class CardTests {

    Card card;

    @BeforeEach
    public void setUp() {
        card = new Card() {
            SuitType suitType = SuitType.SPADE;
            @Override
            public String name() {
                return "Aスペード";
            }
        };
    }

    @Test
    @DisplayName("カード名が取得できること")
    public void name() {
        assertEquals("Aスペード", card.name());
    }

    @Test
    @DisplayName("カードがスートであるか否か判定できること")
    public void isSuit() {
        assertTrue(card.isSuit());
    }
}
