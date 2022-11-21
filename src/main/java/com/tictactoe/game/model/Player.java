package com.tictactoe.game.model;

import lombok.Data;

import java.util.Scanner;

@Data
public class Player {
    private final String name;
    private final String sign;

    private final Scanner scanner = new Scanner(System.in);

    public int[] placeSign(Board board) {
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        if (board.isPositionTaken(row, column) || board.isInvalidPosition(row, column)){
            row = scanner.nextInt();
            column = scanner.nextInt();
        }

        return new int[] {row, column};
    }
}
