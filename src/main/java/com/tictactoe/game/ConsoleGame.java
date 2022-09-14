package com.tictactoe.game;

import com.tictactoe.game.domain.Player;
import com.tictactoe.game.domain.Round;

import java.util.List;
import java.util.Scanner;

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe");

        System.out.println("Player one name:");
        Player playerOne = new Player(scanner.nextLine(), "X");

        System.out.println("Player two name:");
        Player playerTwo = new Player(scanner.nextLine(), "O");

        Round round = new Round(List.of(playerOne, playerTwo));
        round.playRound();

    }
}
