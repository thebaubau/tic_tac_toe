package com.tictactoe.game.domain;

import lombok.Data;

@Data
public class Board {
    // The board:
    // 0, 1, 2
    // 3, 4, 5
    // 6, 7, 8

    // TicTacToe has 3x3 squares. We start with an empty list and continue to add while
    // the game progresses to positions, so position 0 is row 1, column 1

    private String[] board = {"", "", "", "", "", "", "", "", ""};

    public boolean gameIsDone(String sign) {
        if (board[0].equals(sign) && board[1].equals(sign) && board[2].equals(sign)){
            return true;
        }

        if (board[3].equals(sign) && board[4].equals(sign) && board[5].equals(sign)){
            return true;
        }

        if (board[6].equals(sign) && board[7].equals(sign) && board[8].equals(sign)){
            return true;
        }

        if (board[0].equals(sign) && board[3].equals(sign) && board[6].equals(sign)){
            return true;
        }

        if (board[1].equals(sign) && board[4].equals(sign) && board[7].equals(sign)){
            return true;
        }

        if (board[2].equals(sign) && board[5].equals(sign) && board[8].equals(sign)){
            return true;
        }

        if (board[0].equals(sign) && board[4].equals(sign) && board[8].equals(sign)){
            return true;
        }

        if (board[2].equals(sign) && board[4].equals(sign) && board[6].equals(sign)){
            return true;
        }

        return false;
    }

    public void drawBoard() {
        System.out.println("   " + board[0] + " | " + board[1] + " | " + board[2] + " " );
        System.out.println("--- + --- + ---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " " );
        System.out.println("--- + --- + ---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " " );
    }

    public boolean isPositionTaken(int position) {
        if (!board[position].isEmpty()) {
            System.out.println("Position already has a sign. Select another: ");
            return true;
        }

        return false;
    }
}
