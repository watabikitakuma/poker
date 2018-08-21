package tddbc.poker;

import tddbc.cards.Card;
import tddbc.cards.Cards;

import java.util.ArrayList;
import java.util.List;

/**
 * ディーラー
 */
public class Dealer {

    private Cards deck;

    public Dealer(Cards deck) {
        this.deck = deck;
    }

    public void shuffle() {
        deck.shuffle();
    }

    public Cards deal() {
        return deal(Hand.count());
    }

    public Card getCard() {
        return deck.removeOne();
    }

    public Cards deal(int specifiedCount) {
        List<Card> cardsOfHand = new ArrayList<>();
        for (int i = 0; i < specifiedCount; i++) {
            cardsOfHand.add(getCard());
        }
        return new Cards(cardsOfHand);
    }
}
