package jaf.praktikum.oop.ratespiel;

import java.util.Random;

public class GuessGame {
    private int targetNumber;
    private Player winner;

    private final int MAX = 100;

    public GuessGame() {
        targetNumber = new Random().nextInt(MAX) + 1;
    }

    public void startGame(Player[] players) {
        while(true) {
            for (Player player : players) {
                if (player.guess(MAX) == targetNumber) {
                    winner = player;
                    return;
                }
            }
        }
    }

    public Player getWinner() {
        return winner;
    }
}
