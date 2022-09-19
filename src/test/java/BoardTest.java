import com.tictactoe.game.model.Board;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void playerOneIsVictorious() {
        Board board = new Board();

        board.getBoard()[0] = "X";
        board.getBoard()[1] = "X";
        board.getBoard()[2] = "X";

        assertTrue(board.isPlayerVictorious("X"));
    }

}