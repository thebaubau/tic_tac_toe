package com.tictactoe.game.view;

import com.tictactoe.game.model.Player;

public interface IMessages {
    void welcome();
    void playerOne();
    void playerTwo();
    void startingPlayer(Player player);
    void playerSelectPosition(Player player);
    void printSelectedPosition(Player player, int position);
    void printWinner(Player player);
    void positionTaken();
    void positionValid();
    void gameIsADraw();
}
