package com.tictactoe.game.utils;

import lombok.Data;

public class CoordinatesConverter {

    public static int convertToPosition(int row, int column, int numberOfColumns) {
        return numberOfColumns * row + column;

    }
}
