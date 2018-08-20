package tddbc.cards.suit;

import tddbc.cards.Card;

/**
 * スートカード
 */
public class SuitCard implements Card, Comparable<SuitCard> {

    private Rank rank;
    private SuitType suitType;

    public SuitCard(Rank rank, SuitType suitType) {
        this.rank = rank;
        this.suitType = suitType;
    }

    public Rank rank() {
        return rank;
    }

    public SuitType suitType() {
        return suitType;
    }

    public boolean equalsRank(SuitCard another) {
        return rank() == another.rank();
    }

    @Override
    public String name() {
        return rank().shortName() + suitType().symbol();
    }

    @Override
    public int compareTo(SuitCard o) {
        int result = this.rank().number() - o.rank().number();
        if (result == 0) {
            result = this.suitType().ordinal() - o.suitType().ordinal();
        }
        return result;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o.getClass() != this.getClass()) return false;
        SuitCard another = (SuitCard)o;
        return  this.rank() == another.rank() && this.suitType() == another.suitType();
    }
}
