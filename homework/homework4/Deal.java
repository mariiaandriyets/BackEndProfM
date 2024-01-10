package com.proftelran.homework.homework4;

import java.util.*;

public class Deal {
    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);
        final Random random = new Random();

        final Suit[] suits = {Suit.DIAMOND, Suit.CLUBS, Suit.HEART, Suit.SPADES};
        final Rank[] ranks = {Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX,
                Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING, Rank.ACE};

        final int numberOfCards = suits.length * ranks.length; // number of cards

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        // deck initialization
        List<Card> deck = createDeck(suits, ranks);

        // deck shuffling
        Collections.shuffle(deck);

        //player list init
        List<Player> playerList = createPlayerList(players);

        dealCardsToPlayers(playerList, deck, cardsForPlayer);
    }

        private static List<Card> createDeck (Suit[]suits, Rank []ranks){
            List<Card> deck = new ArrayList<>();
            for (Suit suit : suits) {
                for (Rank rank : ranks) {
                    deck.add(new Card(suit, rank));
                }
            }
            return deck;
        }

        private static List<Player> createPlayerList (int players) {
            ArrayList<Player> playersList = new ArrayList<>();
            for (int i = 0; i < players; i++) {
                playersList.add(new Player());
            }
            return playersList;
        }

        private static void dealCardsToPlayers (List<Player> playerList,List<Card> deck, int cardsForPlayer) {
            for (Player player : playerList) {
                for (int i = 0; i < cardsForPlayer; i++) {
                    player.addCard(deck.remove(0));
                }
            }
            System.out.println(playerList);
        }
}




