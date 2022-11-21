package com.tictactoe.game.view;

import com.tictactoe.game.model.Player;

import java.text.MessageFormat;

public class ConsoleMessages implements IMessages{

    @Override
    public void welcome() {
        System.out.println("Welcome to TicTacToe!");
    }

    @Override
    public void playerOne() {
        System.out.println("Player one name:");
    }

    @Override
    public void playerTwo() {
        System.out.println("Player two name:");
    }

    @Override
    public void startingPlayer(Player player) {
        System.out.println("Player " + player.getName() + " starts.");
    }

    @Override
    public void playerSelectPosition(Player player) {
        System.out.println(player.getName() + " select a row and column: ");
    }

    @Override
    public void printSelectedPosition(Player player, int row, int col) {
        String message = MessageFormat.format("{0} selected row {1} and column {2} with sign {3}",
                player.getName(), row, col, player.getSign());

        System.out.println(message);
    }

    @Override
    public void printWinner(Player player) {
        System.out.println("Player " + player.getName() + " WINS!");
    }

    @Override
    public void positionTaken() {
        System.out.println("Position already has a sign. Select another:");
    }

    @Override
    public void positionValid() {
        System.out.println("Enter a value from 0 to 8");
    }

    @Override
    public void gameIsADraw() {
        System.out.println("Game is a draw!");
        System.out.println("Play another round?");
    }
}
