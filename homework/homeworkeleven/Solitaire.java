package com.proftelran.homework.homeworkeleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solitaire {
    public static void main(String[] args) {

       List<Card> cards = new ArrayList<>();

      for (int i = 0; i<9; i++) {
           cards.add(new Card(Suit.CLUB));
       }
        for (int i = 9; i<18; i++) {
            cards.add(new Card(Suit.DIAMOND));;
        }
        for (int i = 18; i<27; i++) {
            cards.add(new Card(Suit.SPADE));
        }
        for (int i = 27; i<36; i++) {
            cards.add(new Card(Suit.HEART));
        }
        Collections.shuffle(cards);
        Stack<Card> stackCard = new Stack<>();

        for (Card element : cards) {
            if (!stackCard.isEmpty() && stackCard.peek().equals(element)) {
                stackCard.pop();
                continue;
            }
            stackCard.push(element);
        }
        System.out.println(stackCard);
    }
}
