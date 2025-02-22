package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceGameTest {
    private DiceGame game;

    @BeforeEach
    void setUp() {
        game = new DiceGame();
    }

    @AfterEach
    void tearDown() {
        game = null;
    }

    @Test
    void rollDie() {
        for (int i = 0; i < 100; i++) {
            int result = game.rollDie();
            assertTrue(result >= 1 && result <= 6, "Die roll should be between 1 and 6");
        }
    }

    @Test
    void isDouble() {
        assertTrue(game.isDouble(3, 3), "Should return true for doubles");
        assertFalse(game.isDouble(2, 5), "Should return false for non-doubles");
    }

    @Test
    void rollUntilDouble() {
        int tries = game.rollUntilDouble();
        assertTrue(tries > 0, "Should take at least one try to roll a double");
    }

    @Test
    void main() {
        DiceGame.main(new String[]{});
    }
}