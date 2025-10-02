package jaf.praktikum.oop.ratespiel;

public class GuessLauncher {
    public static void main(String[] args) {
        Player[] players = new Player[5];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i + 1);
        }

        GuessGame game = new GuessGame();
        game.startGame(players);
        System.out.println("The winner is " + game.getWinner().getNumber());
    }
}
