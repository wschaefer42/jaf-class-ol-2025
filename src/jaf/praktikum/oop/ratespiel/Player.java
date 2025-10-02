package jaf.praktikum.oop.ratespiel;

import java.util.random.RandomGenerator;

public class Player {
    private int number;
    private RandomGenerator random;

    public Player(int number) {
        this.number = number;
        this.random = RandomGenerator.getDefault();
    }

    public int guess(int max) {
        return random.nextInt(max) + 1;
    }

    public int getNumber() {
        return number;
    }
}
