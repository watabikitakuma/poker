package tddbc.poker;

import tddbc.cards.Card;
import tddbc.cards.Cards;

import java.util.ArrayList;
import java.util.List;

/**
 * ディーラー
 */
public class Dealer {

    private Cards cards;

    public Dealer(Cards cards) {
        this.cards = cards;
    }

    public void shuffle() {
        cards.shuffle();
    }

    public Hand deal() {
        List<Card> cardsOfHand = new ArrayList<>();
        for (int i = 0; i < Hand.count(); i++) {
            cardsOfHand.add(getCard());
        }
        return new Hand(cardsOfHand.toArray(new Card[cardsOfHand.size()]));
    }

    public Card getCard() {
        return cards.removeOne();
    }
}
