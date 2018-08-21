package tddbc.cards;

import java.util.*;

/**
 * カードのファーストクラスコレクション
 */
public class Cards implements Iterable<Card> {
    private List<Card> list;

    public Cards(List<Card> cardList) {
        this.list = cardList;
    }

    public static Cards empty() {
        return new Cards(new ArrayList<>());
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

    public Card[] toArray() {
        return list.toArray(new Card[list.size()]);
    }

    public boolean isNotEmpty() {
        return !list.isEmpty();
    }
}
