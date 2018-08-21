package tddbc.poker;

import tddbc.cards.CardCase;
import tddbc.cards.Cards;
import tddbc.poker.io.DiscardReader;
import tddbc.poker.io.Display;

/**
 * ポーカー
 */
public class Poker {

    public static void main(String[] args) {
        Cards cards = new CardCase().getCards();
        Dealer dealer = new Dealer(cards);
        dealer.shuffle();
        Cards dealt = dealer.deal();
        Hand hand = new Hand(dealt);
        Display.show(hand.showCards());

        Cards targets = new DiscardReader().read();

        if (targets.isNotEmpty()) {
            hand.discard(targets);
            Cards drawCards = dealer.deal(targets.count());
            hand.draw(drawCards);
        }

        PokerHandsJudge judge = new PokerHandsJudge();
        System.out.println(hand.showCards());
        System.out.println(judge.call(hand));
    }
}
