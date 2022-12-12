package com.tictactoe.game.view;

import com.tictactoe.game.model.Board;

public class BoardUi {

    public void drawBoard(Board board) {
        System.out.println("+-----+-----+-----+");

        for (int i = 0; i < board.getBoardRowsCount(); i++) {
            for (int j = 0; j < board.getBoardColumnsCount(); j++) {

                System.out.print("|");
                System.out.print("  " + board.getPointValue(i, j) + "  ");

                if (j == board.getBoardColumnsCount() - 1) {
                    System.out.print("|");
                }

                if (j > 0 && j % (board.getBoardColumnsCount() - 1) == 0) {
                    System.out.println("\n+-----+-----+-----+");
                    break;
                }
            }
        }
    }

}
