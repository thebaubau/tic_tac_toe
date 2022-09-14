package com.tictactoe.game.view;

import java.io.IOException;

public class BoardUi {
    public void drawBoard(String[] board) {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " " );
        System.out.println("--- + --- + ---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " " );
        System.out.println("--- + --- + ---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " " );
    }
}
