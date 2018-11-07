package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    Deck deck = new Deck(81);

    @Test
    public void getTopCard()
    {
        Card topCard = deck.getTopCard();
        Card nextCard = deck.getTopCard();
        for(int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(topCard.equals(nextCard));
        }
    }


    @Test
    public void createShuffledDeck()
        {
            Card topCard;
            Card nextCard;
        for(int i = 0; i < 40; i++) {
            topCard = deck.getTopCard();
            nextCard = deck.getTopCard();
            assertTrue(topCard.equals(nextCard));
        }
    }


    @Test
    public void getNumCardsInDeck() {
        int expected = 1;
        int actual = deck.getNumOfCardsInDeck();
        assertEquals(expected, actual);
    }
}