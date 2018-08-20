package tddbc.poker.helper;

import tddbc.cards.Card;
import tddbc.cards.suit.*;

public class CardSet {

    public static Card[] forOnePairCards() {
        Card card1 = new SuitCard(Rank.ACE, SuitType.SPADE);
        Card card2 = new SuitCard(Rank.ACE, SuitType.CLUB);
        Card card3 = new SuitCard(Rank.EIGHT, SuitType.SPADE);
        Card card4 = new SuitCard(Rank.JACK, SuitType.DIAMOND);
        Card card5 = new SuitCard(Rank.FOUR, SuitType.HEART);
        return new Card[]{card1, card2, card3, card4, card5};
    }

    public static Card[] forHighCards() {
        Card card1 = new SuitCard(Rank.ACE, SuitType.SPADE);
        Card card2 = new SuitCard(Rank.QUEEN, SuitType.CLUB);
        Card card3 = new SuitCard(Rank.EIGHT, SuitType.SPADE);
        Card card4 = new SuitCard(Rank.JACK, SuitType.DIAMOND);
        Card card5 = new SuitCard(Rank.FOUR, SuitType.HEART);
        return new Card[]{card1, card2, card3, card4, card5};
    }

    public static Card[] forStraightCards() {
        Card card1 = new SuitCard(Rank.ACE, SuitType.SPADE);
        Card card2 = new SuitCard(Rank.TWO, SuitType.CLUB);
        Card card3 = new SuitCard(Rank.THREE, SuitType.SPADE);
        Card card4 = new SuitCard(Rank.FOUR, SuitType.DIAMOND);
        Card card5 = new SuitCard(Rank.FIVE, SuitType.HEART);
        return new Card[]{card1, card2, card3, card4, card5};
    }

    public static Card[] forRoyalStraightCards() {
        Card card1 = new SuitCard(Rank.TEN, SuitType.SPADE);
        Card card2 = new SuitCard(Rank.JACK, SuitType.CLUB);
        Card card3 = new SuitCard(Rank.QUEEN, SuitType.SPADE);
        Card card4 = new SuitCard(Rank.KING, SuitType.DIAMOND);
        Card card5 = new SuitCard(Rank.ACE, SuitType.HEART);
        return new Card[]{card1, card2, card3, card4, card5};
    }
}
