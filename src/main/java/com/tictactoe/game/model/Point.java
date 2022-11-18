package com.tictactoe.game.model;

import lombok.Data;

@Data
public class Point {
    public final int x;
    public final int y;
    public String value = "-";
}
