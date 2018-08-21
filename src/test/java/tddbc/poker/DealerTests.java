package tddbc.poker;

import org.junit.jupiter.api.Test;
import tddbc.cards.CardCase;
import tddbc.cards.Cards;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DealerTests {

    @Test
    public void deal() {
        Cards deck = new CardCase().getCards();
        Dealer dealer = new Dealer(deck);
        Cards dealtCards = dealer.deal();
        assertEquals(5, dealtCards.count());
    }

    @Test
    public void dealer_should_deal_specified_count() {
        Cards deck = new CardCase().getCards();
        Dealer dealer = new Dealer(deck);
        Cards dealtCards = dealer.deal(2);
        assertEquals(2, dealtCards.count());
    }
}
