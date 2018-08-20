package tddbc.cards;

import tddbc.cards.special.Joker;
import tddbc.cards.suit.set.Clubs;
import tddbc.cards.suit.set.Diamonds;
import tddbc.cards.suit.set.Hearts;
import tddbc.cards.suit.set.Spades;

import java.util.ArrayList;
import java.util.List;

/**
 * カードケース
 */
public class CardCase {

    public Cards getCards() {
        return new Cards(cards());
    }

    public Cards getCardsWithJoker() {
        List<Card> cards = cards();
        cards.add(new Joker());
        return new Cards(cards);
    }

    private List<Card> cards() {
        List<Card> cards = new ArrayList<>();
        cards.addAll(new Spades().toCards());
        cards.addAll(new Diamonds().toCards());
        cards.addAll(new Clubs().toCards());
        cards.addAll(new Hearts().toCards());
        return cards;
    }
}
