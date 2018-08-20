package tddbc.cards;

public interface Card {
    String name();
    default boolean isSuit() {
        return true;
    }
}
