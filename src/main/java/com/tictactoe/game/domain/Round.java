package com.tictactoe.game.domain;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class Round {

    private ArrayList<Player> players;
//    private Player playerTwo;
    public void playRound(){
        int playerToStart = playerToStartRound();



//        while(gameInProgress == true) {
            // Player one selects a sign
            // Game checks if over
                // if over end round
                // else continue game
//        }
    }

    private int playerToStartRound() {
        Random random = new Random();

        return random.ints(0, 1)
                .findFirst()
                .getAsInt();
    }

}
