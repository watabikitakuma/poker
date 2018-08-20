package tddbc.poker;

import tddbc.cards.CardCase;
import tddbc.cards.Cards;

/**
 * ポーカー
 */
public class Poker {

    public static void main(String[] args) {
        Cards cards = new CardCase().getCards();
        Dealer dealer = new Dealer(cards);
        dealer.shuffle();
        Hand hand = dealer.deal();
        System.out.println(hand.showCards());

        PokerHandsJudge judge = new PokerHandsJudge();
        System.out.println(judge.call(hand));
    }
}
