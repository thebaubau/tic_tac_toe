package com.tictactoe.game.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

@RequiredArgsConstructor
public class Round {

    private final List<Player> players;
    private final Board board = new Board();
    private final Scanner scanner = new Scanner(System.in);

    public void playRound(){
        Player currentPlayer = playerToStartRound();

        System.out.println("Player " + currentPlayer.getName() + " starts.");

        while (true){
            System.out.println(currentPlayer.getName() + " select a position: ");
            int position = scanner.nextInt();

            if (board.isPositionTaken(position)){
                position = scanner.nextInt();
            }

            System.out.println(currentPlayer.getName() + " selected " +
                    position + " with sign " + currentPlayer.getSign());

            board.getBoard()[position] = currentPlayer.getSign();
            board.drawBoard();

            if (board.gameIsDone(currentPlayer.getSign())){
                System.out.println("Player " + currentPlayer.getName() + " WINS!");

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
