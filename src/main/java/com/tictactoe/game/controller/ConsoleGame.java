package com.tictactoe.game.controller;

import com.tictactoe.game.model.Player;
import com.tictactoe.game.model.Round;
import com.tictactoe.game.view.BoardUi;
import com.tictactoe.game.view.ConsoleMessages;

import java.util.List;
import java.util.Scanner;

public class ConsoleGame {
    static ConsoleMessages consoleMessages = new ConsoleMessages();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        consoleMessages.welcome();

        consoleMessages.playerOne();
        String playerOneName = scanner.nextLine();

        consoleMessages.playerTwo();
        String playerTwoName = scanner.nextLine();

        Player playerOne = new Player(playerOneName, "X");
        Player playerTwo = new Player(playerTwoName, "O");

        Round round = new Round(List.of(playerOne, playerTwo));
        round.playRound();
    }
}
