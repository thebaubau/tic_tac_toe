package com.tictactoe.game.model;

import com.tictactoe.game.view.BoardUi;
import com.tictactoe.game.view.ConsoleMessages;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@RequiredArgsConstructor
public class Round {

    private final List<Player> players;
    private final Board board = new Board();
    private final BoardUi boardUi = new BoardUi();
    private final Scanner scanner = new Scanner(System.in);

    private final ConsoleMessages consoleMessages = new ConsoleMessages();

    public void playRound(){
        Player currentPlayer = playerToStartRound();

        consoleMessages.startingPlayer(currentPlayer);

        boardUi.drawBoard(board.getBoard());

        while (true){
            consoleMessages.playerSelectPosition(currentPlayer);

            int position = scanner.nextInt();

            if (board.isPositionTaken(position)){
                position = scanner.nextInt();
            }

            consoleMessages.printSelectedPosition(currentPlayer, position);

            board.getBoard()[position] = currentPlayer.getSign();

            boardUi.drawBoard(board.getBoard());

            if (board.gameIsDone(currentPlayer.getSign())){
                consoleMessages.printWinner(currentPlayer);
                break;
            }

            currentPlayer = getNextPlayer(currentPlayer);
        }
    }

    private Player playerToStartRound() {
        Random random = new Random();

        return players.stream().skip(random.nextInt(players.size())).findFirst().get();
    }

    private Player getNextPlayer(Player player) {
        int index = players.indexOf(player);

        if (index == 0) {
            return players.get(1);
        }
        return players.get(0);
    }

}
