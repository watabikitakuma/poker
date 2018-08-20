package tddbc.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * カードのファーストクラスコレクション
 */
public class Cards implements Iterable<Card> {
    private List<Card> list;

    public Cards(List<Card> cardList) {
        this.list = cardList;
    }

    public Card removeOne() {
        return list.remove(0);
    }

    public int count() {
        return list.size();
    }

    public void shuffle() {
        Collections.shuffle(list);
    }

    public boolean equals(Cards another) {
        return Arrays.equals(this.toArray(), another.toArray());
    }

    @Override
    public Iterator<Card> iterator() {
        return list.iterator();
    }

    private Card[] toArray() {
        return list.toArray(new Card[list.size()]);
    }
}
