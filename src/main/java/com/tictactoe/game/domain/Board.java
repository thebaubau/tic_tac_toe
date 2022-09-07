package com.tictactoe.game.domain;

import lombok.Data;
import lombok.Setter;

@Data
public class Board {
    // The board:
    // 1, 2, 3
    // 4, 5, 6
    // 7, 8, 9

    // TicTacToe has 3x3 squares. We start with an empty list and continue to add while
    // the game progresses to positions, so position 0 is row 1, column 1

    @Setter
    private final String[] board = new String[9];

    private boolean gameStatus(String sign) {
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


}
