package com.tictactoe.game.model;

import com.tictactoe.game.view.ConsoleMessages;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.aop.PointcutAdvisor;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Data
public class Board {

    private ConsoleMessages consoleMessages = new ConsoleMessages();

    private List<Point> board = new ArrayList<>();
    private int boardRowsCount = 3;
    private int boardColumnsCount = 3;

    public Board() {
        createBoard();
    }

    public String getPointValue(int col, int row) {
        Predicate<Point> point = p -> p.x == col && p.y == row;

        return board.stream()
                .filter(point)
                .findAny()
                .map(p -> p.value)
                .orElseThrow(() -> new NoSuchElementException("No value at selected position"));
    }

    public void createBoard() {
        for (int i = 0; i < boardColumnsCount; i++) {
            for (int j = 0; j < boardRowsCount; j++) {
                board.add(new Point(i, j));
            }
        }
    }

    public void addRow(){
        for (int i = 0; i < boardColumnsCount; i++) {
            board.add(new Point(i, boardRowsCount - 1));
        }
        boardRowsCount++;
    }

    public void addColumn(){
        for (int i = 0; i < boardRowsCount; i++) {
            board.add(new Point(boardColumnsCount - 1, i));
        }
        boardColumnsCount++;
    }


//    private int[][] winningPositions =
//            {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6},
//            {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    public boolean isPlayerVictorious(String sign) {
        int consecutiveSignsToWin = 0;

        return false;
    }

    public void checkNeighbour() {
        int currentSelectedPoint = 2;
        int rowLength = 3;

        // The board:
        // 0,  1,  2,  3
        // 4,  5,  6,  7
        // 8,  9,  10, 11
        // 12, 13, 14, 15

        // i + 1
        // i + 1, j + 1
        // j + 1
        // i - 1, j - 1
    }

    public void updateBoard(){

    }

    public boolean isBoardFull(){
        for (Point point : board) {
            if (!point.value.matches("[XO]")) {
                return false;
            }
        }

        consoleMessages.gameIsADraw();
        return true;
    }

    public boolean isPositionTaken(int position) {
//        if (!board.get(position).matches("[XO]")) {
//            consoleMessages.positionTaken();
//            return true;
//        }

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
