package com.tictactoe.game.model;

import com.tictactoe.game.view.ConsoleMessages;
import lombok.Data;

@Data
public class Board {
    // The board:
    // 0, 1, 2
    // 3, 4, 5
    // 6, 7, 8

    private ConsoleMessages consoleMessages = new ConsoleMessages();

    private String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    private int[][] winningPositions =
            {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6},
            {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    public boolean isPlayerVictorious(String sign) {
        for (int[] winningPosition : winningPositions) {
            int magicalThree = 0;

            for (int i : winningPosition) {
                if (board[i].equals(sign)) {
                    magicalThree += 1;
                }
            }

            if (magicalThree == 3) return true;
        }

        return false;
    }

    public boolean isBoardFull(){
        for (String s : board) {
            if (s.matches("\\s")) {
                return false;
            }
        }
        consoleMessages.gameIsADraw();
        return true;
    }

    public boolean isPositionTaken(int position) {
        if (!board[position].matches("\\s")) {
            consoleMessages.positionTaken();
            return true;
        }

        return false;
    }

    public boolean isValidPosition(int position) {
        if (position < 0 || position > 8) {
            consoleMessages.positionValid();
            return true;
        }

        return false;
    }
}
