package com.proftelran.homework.homework11.task1;

import java.util.Objects;

public class Card {

        private Suit suitType;

    public Card(Suit suitType) {
        this.suitType = suitType;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" +
                "suitType=" + suitType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suitType == card.suitType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suitType);
    }
}
