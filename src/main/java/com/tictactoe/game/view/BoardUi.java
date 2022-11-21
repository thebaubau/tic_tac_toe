package com.tictactoe.game.view;

import com.tictactoe.game.model.Board;

import java.net.SocketOption;
import java.util.List;

public class BoardUi {
    public void drawBoard(Board board) {
        for (int i = 0; i < board.getBoardRowsCount(); i++) {
            for (int j = 0; j < board.getBoardColumnsCount(); j++) {
                System.out.println(" " + board.getPointValue(i, j) + " ");
            }
        }

//        System.out.println(" " + board[00] + "  |  " + board[01] + "  |  " + board[02] + " " );
//        System.out.println("--- + --- + ---");
//        System.out.println(" " + board[3] + "  |  " + board[4] + "  |  " + board[5] + " " );
//        System.out.println("--- + --- + ---");
//        System.out.println(" " + board[6] + "  |  " + board[7] + "  |  " + board[8] + " " );
    }
}
