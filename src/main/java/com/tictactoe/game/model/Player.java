package com.tictactoe.game.model;

import lombok.Data;

import java.util.Scanner;

@Data
public class Player {
    private final String name;
    private final String sign;

    private final Scanner scanner = new Scanner(System.in);

    public int placeSign(Board board) {
        int position = scanner.nextInt();

        if (board.isPositionTaken(position) || board.isValidPosition(position)){
            position = scanner.nextInt();
        }

        return position;
    }
}
