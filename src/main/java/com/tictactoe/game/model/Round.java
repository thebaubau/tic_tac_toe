package com.tictactoe.game.model;

import com.tictactoe.game.utils.CoordinatesConverter;
import com.tictactoe.game.view.BoardUi;
import com.tictactoe.game.view.ConsoleMessages;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class Round {

    private final List<Player> players;
    private final Board board = new Board();
    private final BoardUi boardUi = new BoardUi();

    private final ConsoleMessages consoleMessages = new ConsoleMessages();

    public void playRound(){
        Player currentPlayer = playerToStartRound();

        consoleMessages.startingPlayer(currentPlayer);

        boardUi.drawBoard(board);

        while (true){
            consoleMessages.playerSelectPosition(currentPlayer);

            selectPosition(currentPlayer);

            boardUi.drawBoard(board);

            if (isRoundOver(currentPlayer)) break;

            currentPlayer = getNextPlayer(currentPlayer);
        }
    }

    private boolean isRoundOver(Player currentPlayer) {
        if (board.isPlayerVictorious(currentPlayer.getSign())){
            consoleMessages.printWinner(currentPlayer);
            return true;
        }

        return board.isBoardFull();
    }

    private void selectPosition(Player currentPlayer) {
        List<Integer> position = currentPlayer.placeSign(board);

        consoleMessages.printSelectedPosition(currentPlayer, position.get(0), position.get(1));

        board.setPointValue(position.get(0), position.get(1), currentPlayer.getSign());
    }

    private Player playerToStartRound() {
        Random random = new Random();

        return players.get(random.nextInt(players.size()));
    }

    private Player getNextPlayer(Player player) {
        int index = players.indexOf(player);

        if (index == 0) {
            return players.get(1);
        }
        return players.get(0);
    }

}
