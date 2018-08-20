package tddbc.cards.suit;

import tddbc.cards.Card;
import tddbc.cards.Cards;

import java.util.*;

/**
 * スートカードのファーストクラスコレクション
 */
public class SuitCards implements Iterable<SuitCard> {

    private List<SuitCard> list;

    public SuitCards(Card[] cards) {
        List<SuitCard> suitCardList = new ArrayList<>();
        for (Card card : cards) {
            if (card.isSuit()) {
                suitCardList.add((SuitCard)card);
            }
        }
        list = suitCardList;
    }

    SuitCards(List<SuitCard> list) {
        this.list = list;
    }

    public void sort() {
        Collections.sort(list);
    }

    public SuitCard[] toSuitCards() {
        return list.toArray(new SuitCard[list.size()]);
    }

    @Override
    public Iterator<SuitCard> iterator() {
        return list.iterator();
    }

    public int count() {
        return list.size();
    }

    public int uniqueCountOfRank() {
        List<Rank> ranks = rankList();
        Set<Rank> uniqueRanks = new HashSet<>(ranks);
        return uniqueRanks.size();
    }

    public int uniqueCountOfSuit() {
        List<SuitType> suitTypes = suitTypeList();
        Set<SuitType> uniqueSuitTypes = new HashSet<>(suitTypes);
        return uniqueSuitTypes.size();
    }

    private List<Rank> rankList() {
        List<Rank> ranks = new ArrayList<>();
        for (SuitCard card : list) {
            ranks.add(card.rank());
        }
        return ranks;
    }

    private List<SuitType> suitTypeList() {
        List<SuitType> suitTypes = new ArrayList<>();
        for (SuitCard card : list) {
            suitTypes.add(card.suitType());
        }
        return suitTypes;
    }

    public String[] toTextArray() {
        List<String> strings = new ArrayList<>();
        list.forEach(suitCard -> strings.add(suitCard.name()) );
        return strings.toArray(new String[strings.size()]);
    }

    public boolean discard(SuitCard releaseCard) {
        return list.remove(releaseCard);
    }

    public void add(SuitCard suitCard) {
        list.add(suitCard);
    }

    public boolean isSequentialRanks() {
        SuitCard suitCard = list.get(0);
        for (int i=1; i<list.size(); i++) {
            SuitCard nextCard = list.get(i);
            if (suitCard.rank().number() +1 != nextCard.rank().number()) {
                return false;
            }
            suitCard = nextCard;
        }
        return true;
    }
}
