package tddbc.poker;

import tddbc.cards.Card;
import tddbc.cards.Cards;
import tddbc.cards.suit.SuitCard;
import tddbc.cards.suit.SuitCards;

/**
 * 手札
 */
public class Hand {

    private static final int HAND_COUNT = 5;

    SuitCards suitCards;
    Card wildCard;

    public Hand(Card[] cards) {
        setSuitsOrWildCard(cards);
        sort();
    }

    public Hand(Cards cards) {
        this(cards.toArray());
    }

    public static int count() {
        return HAND_COUNT;
    }

    public SuitCard[] toSuitCards() {
        return suitCards.toSuitCards();
    }

    public int countOfSuitCard() {
        return suitCards.count();
    }

    public int uniqueCountOfRank() {
        return suitCards.uniqueCountOfRank();
    }

    public int uniqueCountOfSuit() {
        return suitCards.uniqueCountOfSuit();
    }

    public String showCards() {
        return "|" + String.join("|", suitCards.toTextArray()) + "|";
    }

    public boolean hasWildCard() {
        return wildCard != null;
    }

    private void setSuitsOrWildCard(Card[] cards) {
        suitCards = new SuitCards(cards);
        setWildCard(cards);
    }

    private void setWildCard(Card[] cards) {
        for (Card card : cards) {
            if (!card.isSuit()) {
                wildCard = card;
            }
        }
    }

    public void discard(Cards cards) {
        for (Card card : cards) {
            if (card.isSuit()) {
                suitCards.discard((SuitCard)card);
            } else {
                wildCard = null;
            }
        }
    }

    public void draw(Cards cards) {
        for (Card card : cards) {
            if (card.isSuit()) {
                suitCards.add((SuitCard)card);
            } else {
                wildCard = card;
            }
        }
    }

    public void sort() {
        suitCards.sort();
    }

    public boolean isSequentialRanks() {
        return suitCards.isSequentialRanks();
    }
}
