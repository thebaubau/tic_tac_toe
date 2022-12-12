package com.tictactoe.game.view;

import com.tictactoe.game.model.PlayerView;

import java.util.Scanner;

public class ConsoleView implements PlayerView {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int readNextInt() {
        return scanner.nextInt();
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
