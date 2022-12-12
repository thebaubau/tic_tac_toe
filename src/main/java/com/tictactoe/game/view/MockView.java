package com.tictactoe.game.view;

import com.tictactoe.game.model.PlayerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockView implements PlayerView {
    private List<Integer> mockedUserInputs = new ArrayList<>();
    private List<String> displayMessages = new ArrayList<>();

    @Override
    public int readNextInt() {
        return  mockedUserInputs.remove(0);
    }

    @Override
    public void write(String message) {
        displayMessages.add(message);
    }

    public List<String> getDisplayMessages() {
        return displayMessages;
    }

    public void addMockedUserInputs(Integer... values) {
        mockedUserInputs.addAll(Arrays.asList(values));
    }
}
