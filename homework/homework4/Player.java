package com.proftelran.homework.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private List<Card> cards;


    public Player() {
    }

    public void addCard (Card card) {
        if (this.cards == null) {
            this.cards = new ArrayList<>();
        }
        this.cards.add(card);
    }
    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                '}';
    }
}
