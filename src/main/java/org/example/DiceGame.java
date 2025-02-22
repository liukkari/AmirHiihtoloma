package org.example;

import java.util.Random;

public class DiceGame {
    private Random random;

    public DiceGame() {
        this.random = new Random();
    }

    public int rollDie() {
        return random.nextInt(6) + 1;
    }

    public boolean isDouble(int die1, int die2) {
        return die1 == die2;
    }

    public int rollUntilDouble() {
        int count = 0;
        int die1, die2;
        do {
            die1 = rollDie();
            die2 = rollDie();
            count++;
            System.out.println("Noppa 1: " + die1);
            System.out.println("Noppa 2: " + die2);
            if (isDouble(die1, die2)) {
                System.out.println("Heitit tuplat!");
            } else {
                System.out.println("Yritä uudelleen.");
            }
        } while (!isDouble(die1, die2));
        return count;
    }

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        System.out.println("Heitetään noppia...");
        int tries = game.rollUntilDouble();
        System.out.println("Meni " + tries + " yritystä ennen kuin molemmat nopat näyttivät samaa arvoa.");
    }
}