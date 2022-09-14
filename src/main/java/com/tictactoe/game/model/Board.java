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

    public boolean isPositionTaken(int position) {
        if (!board[position].isEmpty()) {
            consoleMessages.positionTaken();
            return true;
        }

        return false;
    }
}
