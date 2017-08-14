package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by user on 14/08/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void canStartGame() {
        game.start();
        game.start();
        assertEquals(2, game.getPlayerHandSize());
        assertEquals(2, game.getDealerHandSize());
        assertNotEquals(0, game.getPlayerPoints());
        assertNotEquals(0, game.getDealerPoints());
        assertEquals(48, game.getDeckSize());

    }

}