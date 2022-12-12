package com.tictactoe.game.model;

import com.tictactoe.game.view.ConsoleView;
import lombok.Data;

import java.util.List;
import java.util.Scanner;

@Data
public class Player {
    private final String name;
    private final String sign;

    private final ConsoleView view;

    private final Scanner scanner = new Scanner(System.in);

    public List<Integer> placeSign(Board board) {
        int row = view.readNextInt();
        int column = view.readNextInt();

        if (board.isPositionTaken(row, column) || board.isInvalidPosition(row, column)){
            row = view.readNextInt();
            column = view.readNextInt();
        }

        return List.of(row, column);
    }
}
