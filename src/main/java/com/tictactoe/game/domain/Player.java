package com.tictactoe.game.domain;

import lombok.Data;

@Data
public class Player {
    private final String name;
    private final String sign;

    public int placeSign(int location) {

        return location;
    }
}
