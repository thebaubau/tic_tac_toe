import com.tictactoe.game.model.Board;
import com.tictactoe.game.view.ConsoleView;
import com.tictactoe.game.model.Player;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void playerSelectsALetterAsBoardPosition() {
        Player player = new Player("Daniel", "X", new ConsoleView());
        Board board = new Board();

        player.placeSign(board);
    }
}
