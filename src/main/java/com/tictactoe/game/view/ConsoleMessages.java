package com.tictactoe.game.view;

import com.tictactoe.game.model.Player;

public class ConsoleMessages implements IMessages{

    public void welcome() {
        System.out.println("Welcome to TicTacToe!");
    }

    public void playerOne() {
        System.out.println("Player one name:");
    }

    public void playerTwo() {
        System.out.println("Player two name:");
    }

    public void startingPlayer(Player player) {
        System.out.println("Player " + player.getName() + " starts.");
    }

    public void playerSelectPosition(Player player) {
        System.out.println(player.getName() + " select a position: ");
    }

    @Override
    public void printSelectedPosition(Player player, int position) {
        System.out.println(player.getName() + " selected " +
                position + " with sign " + player.getSign());
    }

    @Override
    public void printWinner(Player player) {
        System.out.println("Player " + player.getName() + " WINS!");
    }

    @Override
    public void positionTaken() {
        System.out.println("Position already has a sign. Select another:");
    }
}
